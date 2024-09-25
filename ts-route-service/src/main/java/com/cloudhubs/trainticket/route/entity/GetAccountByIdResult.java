package com.cloudhubs.trainticket.route.entity;

import com.cloudhubs.trainticket.route.entity.Account;
import lombok.Data;
import com.cloudhubs.trainticket.route.entity.Account;

/**
 * @author fdse
 */
@Data
public class GetAccountByIdResult {

    private boolean status;

    private String message;

    private Account account;

    public GetAccountByIdResult() {
        //Default Constructor
    }

}
