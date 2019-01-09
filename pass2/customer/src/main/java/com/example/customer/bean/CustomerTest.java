package com.example.customer.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerTest {

  @Id
  private Long id;
  private String custName;
  private String custNickname;

  public String getCustNickname() {
    return custNickname;
  }

  public void setCustNickname(String custNickname) {
    this.custNickname = custNickname;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CustomerTest(Long id, String custName) {
    this.id = id;
    this.custName = custName;
  }

  public CustomerTest() {
    super();
  }

  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }

}
