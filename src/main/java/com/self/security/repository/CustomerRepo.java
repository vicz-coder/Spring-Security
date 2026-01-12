package com.self.security.repository;

import com.self.security.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Integer> {

    Optional<Customer> findByEmail(String email);

}
