package com.cloudhubs.trainticket.route.service;

import com.cloudhubs.trainticket.route.util.Response;
import org.springframework.http.HttpHeaders;
import com.cloudhubs.trainticket.route.dto.UserDto;

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
