package com.example.customer.dao;

import com.example.customer.bean.CustomerTest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerTestDao {
    int addCustomerTest(CustomerTest customerTest);
    List<CustomerTest> getCustomerTests();
}
