package com.example.customer.repository;

import com.example.customer.bean.CustomerTest;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerTestRepository extends JpaRepository<CustomerTest,Long> {
}
