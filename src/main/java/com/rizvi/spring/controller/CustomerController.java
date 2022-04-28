package com.rizvi.spring.controller;


import com.rizvi.spring.entity.BookDetail;
import com.rizvi.spring.entity.Customer;
import com.rizvi.spring.repository.CustomerRepository;
import com.rizvi.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

        @Autowired
        private CustomerService customerService;

        @PostMapping ("/")
        public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
       }

       @GetMapping("/")
        public List<Customer> getCustomer(@RequestBody  Customer customer) {
            return customerService.getCustomer(customer);
        }

        @GetMapping("/bookDetails/{bookId}")
        public BookDetail getBookDetails(@PathVariable ("bookId") Long bookId){
             return customerService.getBookDetails(bookId);


        }
    }




