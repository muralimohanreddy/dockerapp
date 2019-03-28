package com.cgi.banking.models;
/*
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
@Entity
@Table(name="CGI_Customer")
public class Customer {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="Customer_Id")
	 private long customerId;
     @Column(name="First_Name",nullable=false,length=50)
     private String firstName;
     @Column(name="Last_Name",nullable=false,length=50)
     private String lastName;
     @Column(name="Address",nullable=false,length=150)
     private String address;
     @Column(name="MobileNo")
     private long mobileNo;
     @Temporal(TemporalType.DATE)
     @JsonFormat(pattern="yyyy-MMM-dd",shape=Shape.STRING)
     @Column(name="DOB")
     private Date dob;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
     
     
     
     
     
     
     
     
	
}
*/