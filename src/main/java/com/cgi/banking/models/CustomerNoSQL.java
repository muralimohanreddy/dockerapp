package com.cgi.banking.models;


import java.util.Date;
//import javax.persistence.Id;
import org.bson.types.ObjectId;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customers")
public class CustomerNoSQL{
     //@Id
     private ObjectId _id;
     
	 private long customerId;
     
     private String firstName;
    
     private String lastName;
     
     private String address;
     
     private long mobileNo;
    
     private String dob;
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

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
     
     
     
     
     
     
     
     
	
}

