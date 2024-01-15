package com.cloudhubs.trainticket.rebook.service;

import com.cloudhubs.trainticket.rebook.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.rebook.entity.RebookInfo;

/**
 * @author fdse
 */
public interface RebookService {
    Response rebook(RebookInfo info, HttpHeaders headers);
    Response payDifference(RebookInfo info,  HttpHeaders headers);
}
