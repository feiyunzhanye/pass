package com.example.customer.dao;

import com.example.customer.bean.Customer;
import com.example.customer.bean.CustomerTest2;
import com.example.customer.service.CustomerService;
import com.example.customer.service.CustomerTest2Service;
import com.example.customer.service.CustomerTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDaoTest {

@Resource
private CustomerTestService customerTestService;
@Resource
private CustomerService customerService;
@Resource
private CustomerTest2Service customerTest2Service;
    @Test
    public void CustomerTest() throws Exception{
        List<CustomerTest2> CustomerTest2List = customerTest2Service.findAll();
        System.out.println("findAll:"+CustomerTest2List.size());
       List<Customer> customerList = customerService.findAll();
        System.out.println("CustomerFindAll:"+customerList.size());
        /*Long a = 1540l;
        Customer customer = customerService.findById(a);*/
    }
}
