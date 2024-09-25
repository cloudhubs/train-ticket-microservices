package com.cloudhubs.trainticket.travel.util;

import com.cloudhubs.trainticket.travel.entity.Contacts;
import com.cloudhubs.trainticket.travel.util.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.cloudhubs.trainticket.travel.entity.WaitListOrderStatus;
import com.cloudhubs.trainticket.travel.entity.WaitListOrderVO;
import com.cloudhubs.trainticket.travel.service.ServiceResolver;
import com.cloudhubs.trainticket.travel.service.WaitListOrderService;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PollThread extends Thread{

    private Date waitUntil;

    private WaitListOrderVO waitListOrderVO;

    private HttpHeaders httpHeaders;

    private RestTemplate restTemplate;

    private WaitListOrderService waitListOrderService;

    final static Integer INTERVAL_MINUTES=5;

    public PollThread(Date waitUntilTime,WaitListOrderService service, WaitListOrderVO order, RestTemplate template, HttpHeaders headers){
        restTemplate=template;
        httpHeaders=headers;
        waitListOrderVO=order;
        waitListOrderService =service;
        waitUntil=waitUntilTime;
    }


    @Override
    public void run() {
        String service_url=serviceResolver.getServiceUrl("ts-preserve-service");
        HttpEntity requestEntityPreserve = new HttpEntity(waitListOrderVO,HeadersUtils.prepareForSent(httpHeaders));

        //TODO compare with waitUntilTime
        while(true){
            long currentTime=System.currentTimeMillis();
            if(waitUntil.getTime()>currentTime){
                // expired
                waitListOrderService.modifyWaitListOrderStatus(WaitListOrderStatus.EXPIRED.getCode(), waitListOrderVO.getAccountId());
                break;
            }
            Response postResult=doPreserve(service_url,requestEntityPreserve);
            if(postResult.getStatus()==0){
                //预定失败
                try {
                    TimeUnit.MINUTES.sleep(INTERVAL_MINUTES);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                // preserve success
                waitListOrderService.modifyWaitListOrderStatus(WaitListOrderStatus.COLLECTED.getCode(),waitListOrderVO.getAccountId());
                break;
            }
        }
    }

    @Autowired
    private ServiceResolver serviceResolver;

    private Response doPreserve(String url, HttpEntity requestParam){
        ResponseEntity<Response<Contacts>> rePostPreserveResult = restTemplate.exchange(
                url + "/api/v1/contactservice/preserve",
                HttpMethod.POST,
                requestParam,
                new ParameterizedTypeReference<Response<Contacts>>() {
                });
        return rePostPreserveResult.getBody();
    }

}
