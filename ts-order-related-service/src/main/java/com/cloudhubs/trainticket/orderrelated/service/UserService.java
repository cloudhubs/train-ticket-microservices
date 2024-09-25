package com.cloudhubs.trainticket.orderrelated.service;

import com.cloudhubs.trainticket.orderrelated.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.orderrelated.dto.UserDto;

/**
 * @author fdse
 */
public interface UserService {
    Response saveUser(UserDto user, HttpHeaders headers);

    Response getAllUsers(HttpHeaders headers);

    Response findByUserName(String userName, HttpHeaders headers);
    Response findByUserId(String userId, HttpHeaders headers);


    Response deleteUser(String userId, HttpHeaders headers);

    Response updateUser(UserDto user, HttpHeaders headers);
}
