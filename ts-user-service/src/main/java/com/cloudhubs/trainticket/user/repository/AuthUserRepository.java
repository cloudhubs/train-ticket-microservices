package com.cloudhubs.trainticket.user.repository;

import com.cloudhubs.trainticket.user.entity.AuthUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author fdse
 */
public interface AuthUserRepository extends CrudRepository<AuthUser, String> {

    /**
     * find by username
     *
     * @param username username
     * @return Optional<User>
     */
    Optional<AuthUser> findByUsername(String username);

    /**
     * delete by user id
     *
     * @param userId user id
     * @return null
     */
    void deleteByUserId(String userId);
}
