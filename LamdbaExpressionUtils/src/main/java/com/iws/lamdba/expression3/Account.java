package com.iws.lamdba.expression3;
public class Account {
 
 private int accNo;
 private String accType;
 private String accStatus;
 
 public Account(int accountNo, String accountType, String accountStatus){
 accNo = accountNo;
 accType = accountType;
 accStatus = accountStatus;
 }
 
 public int getAccNo() {
 return accNo;
 }
 public void setAccNo(int accNo) {
 this.accNo = accNo;
 }
 public String getAccType() {
 return accType;
 }
 public void setAccType(String accType) {
 this.accType = accType;
 }
 public String getAccStatus() {
 return accStatus;
 }
 public void setAccStatus(String accStatus) {
 this.accStatus = accStatus;
 } 
}
