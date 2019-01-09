package com.example.customer.service;

import com.example.customer.bean.Customer;

import java.util.List;

public interface CustomerService {
    Customer findById(Long id);
    List<Customer> findAll();
    Customer save(Customer customer);
    void delete(Long id);
}
