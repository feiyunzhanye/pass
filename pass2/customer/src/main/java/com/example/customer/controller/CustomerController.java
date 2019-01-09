package com.example.customer.controller;

import com.example.customer.bean.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping("/customer/getDetail")
    public Customer getCustomerById(Long id){
        Customer customer = customerService.findById(id);
        return  customer;
    }
}
