package com.cloudhubs.trainticket.route.dto;

import lombok.*;

import java.util.UUID;

/**
 * @author fdse
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private String userId;
    
    private String userName;

    private String password;

    private int gender;

    private int documentType;

    private String documentNum;

    private String email;
}
