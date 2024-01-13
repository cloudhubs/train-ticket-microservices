package com.cloudhubs.trainticket.cancel.service;

import com.cloudhubs.trainticket.cancel.dto.UserDto;
import com.cloudhubs.trainticket.cancel.util.Response;
import org.springframework.http.HttpHeaders;

/**
 * @author fdse
 */
public interface AdminUserService {

    /**
     * get all users
     *
     * @param headers headers
     * @return Response
     */
    Response getAllUsers(HttpHeaders headers);

    /**
     * delete user by user id
     *
     * @param userId user id
     * @param headers headers
     * @return Response
     */
    Response deleteUser(String userId, HttpHeaders headers);

    /**
     * update user by user dto
     *
     * @param userDto user dto
     * @param headers headers
     * @return Response
     */
    Response updateUser(UserDto userDto, HttpHeaders headers);

    /**
     * add user by user dto
     *
     * @param userDto user dto
     * @param headers headers
     * @return Response
     */
    Response addUser(UserDto userDto, HttpHeaders headers);
}
