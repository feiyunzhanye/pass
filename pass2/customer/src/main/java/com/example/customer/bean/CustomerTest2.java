package com.example.customer.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class CustomerTest2 {

  private java.sql.Timestamp createDate;
  private Long createStaff;
  private String custAddr;
  private String custAreaGrade;
  private String custControlLevel;
  @Id
  private Long custId;
  private String extCustId;
  private String ext1_CustId;
  private Long custOrderId;
  private String siebelRowId;


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public Long getCreateStaff() {
    return createStaff;
  }

  public void setCreateStaff(Long createStaff) {
    this.createStaff = createStaff;
  }


  public String getCustAddr() {
    return custAddr;
  }

  public void setCustAddr(String custAddr) {
    this.custAddr = custAddr;
  }


  public String getCustAreaGrade() {
    return custAreaGrade;
  }

  public void setCustAreaGrade(String custAreaGrade) {
    this.custAreaGrade = custAreaGrade;
  }


  public String getCustControlLevel() {
    return custControlLevel;
  }

  public void setCustControlLevel(String custControlLevel) {
    this.custControlLevel = custControlLevel;
  }


  public Long getCustId() {
    return custId;
  }

  public void setCustId(Long custId) {
    this.custId = custId;
  }


  public String getExtCustId() {
    return extCustId;
  }

  public void setExtCustId(String extCustId) {
    this.extCustId = extCustId;
  }


  public String getext1_CustId() {
    return ext1_CustId;
  }

  public void setext1_CustId(String ext1_CustId) {
    this.ext1_CustId = ext1_CustId;
  }


  public Long getCustOrderId() {
    return custOrderId;
  }

  public void setCustOrderId(Long custOrderId) {
    this.custOrderId = custOrderId;
  }


  public String getSiebelRowId() {
    return siebelRowId;
  }

  public void setSiebelRowId(String siebelRowId) {
    this.siebelRowId = siebelRowId;
  }

}
