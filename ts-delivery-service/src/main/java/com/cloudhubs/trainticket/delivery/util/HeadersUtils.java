package com.cloudhubs.trainticket.delivery.util;

import org.springframework.http.HttpHeaders;

public class HeadersUtils {
    public static HttpHeaders prepareForSent(HttpHeaders headers) {
        var sentHeaders = new HttpHeaders(headers);
        sentHeaders.remove("content-length");

        return sentHeaders;
    }
}
