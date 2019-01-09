package com.example.customer.repository;

import com.example.customer.bean.CustomerTest2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerTest2Repository extends JpaRepository<CustomerTest2,Long> {
    /**
     * 搜索全部
     * */
}
