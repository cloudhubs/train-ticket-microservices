package com.cloudhubs.trainticket.orderrelated.repository;

import com.cloudhubs.trainticket.orderrelated.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @author fdse
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserName(String userName);

    User findByUserId(String userId);

    void deleteByUserId(String userId);

    @Override
    List<User> findAll();
}
