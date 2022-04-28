package com.rizvi.spring.service;

import com.rizvi.spring.entity.BookDetail;
import com.rizvi.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> getCustomer(Customer customer);

    public BookDetail getBookDetails(Long customerId);


}
