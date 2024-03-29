package com.cloudhubs.trainticket.travel.init;

import com.cloudhubs.trainticket.travel.entity.OrderStatus;
import com.cloudhubs.trainticket.travel.util.StringUtils;
//import org.apache.tomcat.jni.Time;
import com.cloudhubs.trainticket.travel.entity.Order;
import com.cloudhubs.trainticket.travel.entity.SeatClass;
import com.cloudhubs.trainticket.travel.service.OrderOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @author fdse
 */
@Component
public class OtherInitData implements CommandLineRunner {
    @Autowired
    OrderOtherService service;

    @Override
    public void run(String... args)throws Exception{

        Order order1 = new Order();

        order1.setAccountId("4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f");
        order1.setCoachNumber(5);
        order1.setContactsDocumentNumber("Test");
        order1.setContactsName("Test");
        order1.setDocumentType(1);
        order1.setFrom("shanghai");
        order1.setId("4d2a46c7-71cb-4cf1-c5bb-b68406d9da6f");
        order1.setPrice("100");
        order1.setSeatClass(SeatClass.FIRSTCLASS.getCode());
        order1.setSeatNumber("6A");
        order1.setStatus(OrderStatus.PAID.getCode());
        order1.setTo("taiyuan");
        order1.setTrainNumber("K1235");
        order1.setTravelDate("2022-10-01 00:00:00"); //NOSONAR
        order1.setTravelTime("2022-10-01 00:00:00"); //NOSONAR
        service.create(order1,null);
    }

}
