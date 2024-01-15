package com.cloudhubs.trainticket.orderrelated.repository;


import com.cloudhubs.trainticket.orderrelated.entity.SecurityConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Optional;

/**
 * @author fdse
 */
@Repository
public interface SecurityRepository extends JpaRepository<SecurityConfig,String> {


    SecurityConfig findByName(String name);


    Optional<SecurityConfig> findById(String id);

    @Override
    ArrayList<SecurityConfig> findAll();

    void deleteById(String id);
}
