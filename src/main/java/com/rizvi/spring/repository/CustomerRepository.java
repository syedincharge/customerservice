package com.rizvi.spring.repository;

import com.rizvi.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
