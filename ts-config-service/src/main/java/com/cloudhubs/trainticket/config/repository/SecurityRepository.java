package com.cloudhubs.trainticket.config.repository;


import com.cloudhubs.trainticket.config.entity.SecurityConfig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Optional;

/**
 * @author fdse
 */
@Repository
public interface SecurityRepository extends CrudRepository<SecurityConfig,String> {


    SecurityConfig findByName(String name);


    Optional<SecurityConfig> findById(String id);

    @Override
    ArrayList<SecurityConfig> findAll();

    void deleteById(String id);
}
