package com.cloudhubs.trainticket.cancel.repository;

import com.cloudhubs.trainticket.cancel.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fdse
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByUserName(String userName);

    User findByUserId(String userId);

    void deleteByUserId(String userId);

    @Override
    List<User> findAll();
}
