package com.example.customer.service.Impl;

import com.example.customer.bean.CustomerTest2;
import com.example.customer.repository.CustomerTest2Repository;
import com.example.customer.service.CustomerTest2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerTest2Impl implements CustomerTest2Service {
    @Resource
    private CustomerTest2Repository customerTest2Repository;
    @Override
    public List<CustomerTest2> findAll(){
        return customerTest2Repository.findAll();
    }
}
