package com.example.customer.service.Impl;

import com.example.customer.bean.CustomerTest;
import com.example.customer.repository.CustomerTestRepository;
import com.example.customer.service.CustomerService;
import com.example.customer.service.CustomerTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerTestImpl implements CustomerTestService {
    @Resource
    private CustomerTestRepository customerTestRepository;
    @Override
    public List<CustomerTest>  findAll(){
        return customerTestRepository.findAll();
    }
}
