package com.rizvi.spring.service;


import com.rizvi.spring.entity.Book;
import com.rizvi.spring.entity.BookDetail;
import com.rizvi.spring.entity.Customer;
import com.rizvi.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomer(Customer customer) {
        return customerRepository.findAll();
    }

    @Override
    public BookDetail getBookDetails(Long customerId ) {
        Optional<Customer> cust = customerRepository.findById(Long.valueOf(customerId));
        Long bookId = cust.get().getBookId();
        BookDetail bookDetail = new BookDetail();
        Book book =  restTemplate.getForObject("http://BOOK-SERVICE/books/"+bookId, Book.class);
        bookDetail.setBook(book);
        bookDetail.setCustomer(cust.get());
        return bookDetail;
    }
}
