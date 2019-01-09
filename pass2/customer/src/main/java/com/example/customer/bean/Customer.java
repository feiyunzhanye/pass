package com.example.customer.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

  private java.sql.Timestamp createDate;
  private Long createStaff;
  private String custAddr;
  private String custAreaGrade;
  private String custControlLevel;
  @Id
  private Long custId;
  private String custName;
  private String custNumber;
  private Long custOrderId;
  private Long custSourceId;
  private String custSubType;
  private String custType;
  private Long distributorId;
  private java.sql.Timestamp enterDate;
  private String extCustId;
  private String ext1_CustId;
  private String ext2_CustId;
  private String ext3_CustId;
  private String groupCustId;
  private Long industryTypeId;
  private Long isInstead;
  private Long isRealname;
  private Long lastOrderItemId;
  private Long partyId;
  private Long regionId;
  private String remark;
  private String secrecyLevel;
  private String statusCd;
  private java.sql.Timestamp statusDate;
  private Long taxPayerId;
  private java.sql.Timestamp updateDate;
  private Long updateStaff;
  private String siebelRowId;
  private String marketTypeCd;


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


  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }


  public String getCustNumber() {
    return custNumber;
  }

  public void setCustNumber(String custNumber) {
    this.custNumber = custNumber;
  }


  public Long getCustOrderId() {
    return custOrderId;
  }

  public void setCustOrderId(Long custOrderId) {
    this.custOrderId = custOrderId;
  }


  public Long getCustSourceId() {
    return custSourceId;
  }

  public void setCustSourceId(Long custSourceId) {
    this.custSourceId = custSourceId;
  }


  public String getCustSubType() {
    return custSubType;
  }

  public void setCustSubType(String custSubType) {
    this.custSubType = custSubType;
  }


  public String getCustType() {
    return custType;
  }

  public void setCustType(String custType) {
    this.custType = custType;
  }


  public Long getDistributorId() {
    return distributorId;
  }

  public void setDistributorId(Long distributorId) {
    this.distributorId = distributorId;
  }


  public java.sql.Timestamp getEnterDate() {
    return enterDate;
  }

  public void setEnterDate(java.sql.Timestamp enterDate) {
    this.enterDate = enterDate;
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


  public String getext2_CustId() {
    return ext2_CustId;
  }

  public void setext2_CustId(String ext2_CustId) {
    this.ext2_CustId = ext2_CustId;
  }


  public String getext3_CustId() {
    return ext3_CustId;
  }

  public void setext3_CustId(String ext3_CustId) {
    this.ext3_CustId = ext3_CustId;
  }


  public String getGroupCustId() {
    return groupCustId;
  }

  public void setGroupCustId(String groupCustId) {
    this.groupCustId = groupCustId;
  }


  public Long getIndustryTypeId() {
    return industryTypeId;
  }

  public void setIndustryTypeId(Long industryTypeId) {
    this.industryTypeId = industryTypeId;
  }


  public Long getIsInstead() {
    return isInstead;
  }

  public void setIsInstead(Long isInstead) {
    this.isInstead = isInstead;
  }


  public Long getIsRealname() {
    return isRealname;
  }

  public void setIsRealname(Long isRealname) {
    this.isRealname = isRealname;
  }


  public Long getLastOrderItemId() {
    return lastOrderItemId;
  }

  public void setLastOrderItemId(Long lastOrderItemId) {
    this.lastOrderItemId = lastOrderItemId;
  }


  public Long getPartyId() {
    return partyId;
  }

  public void setPartyId(Long partyId) {
    this.partyId = partyId;
  }


  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getSecrecyLevel() {
    return secrecyLevel;
  }

  public void setSecrecyLevel(String secrecyLevel) {
    this.secrecyLevel = secrecyLevel;
  }


  public String getStatusCd() {
    return statusCd;
  }

  public void setStatusCd(String statusCd) {
    this.statusCd = statusCd;
  }


  public java.sql.Timestamp getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(java.sql.Timestamp statusDate) {
    this.statusDate = statusDate;
  }


  public Long getTaxPayerId() {
    return taxPayerId;
  }

  public void setTaxPayerId(Long taxPayerId) {
    this.taxPayerId = taxPayerId;
  }


  public java.sql.Timestamp getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(java.sql.Timestamp updateDate) {
    this.updateDate = updateDate;
  }


  public Long getUpdateStaff() {
    return updateStaff;
  }

  public void setUpdateStaff(Long updateStaff) {
    this.updateStaff = updateStaff;
  }


  public String getSiebelRowId() {
    return siebelRowId;
  }

  public void setSiebelRowId(String siebelRowId) {
    this.siebelRowId = siebelRowId;
  }


  public String getMarketTypeCd() {
    return marketTypeCd;
  }

  public void setMarketTypeCd(String marketTypeCd) {
    this.marketTypeCd = marketTypeCd;
  }

}
