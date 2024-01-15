package com.cloudhubs.trainticket.preserve.service;

import com.cloudhubs.trainticket.preserve.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.preserve.entity.RebookInfo;

/**
 * @author fdse
 */
public interface RebookService {
    Response rebook(RebookInfo info, HttpHeaders headers);
    Response payDifference(RebookInfo info,  HttpHeaders headers);
}
