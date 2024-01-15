package com.cloudhubs.trainticket.user.service;

import com.cloudhubs.trainticket.user.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.user.entity.RebookInfo;

/**
 * @author fdse
 */
public interface RebookService {
    Response rebook(RebookInfo info, HttpHeaders headers);
    Response payDifference(RebookInfo info,  HttpHeaders headers);
}
