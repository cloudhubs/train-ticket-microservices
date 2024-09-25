package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.cancel.dto.UserDto;

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
