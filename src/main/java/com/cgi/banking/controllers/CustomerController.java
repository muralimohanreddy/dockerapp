package com.cgi.banking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.cgi.banking.models.Customer;
import com.cgi.banking.models.CustomerNoSQL;
import com.cgi.banking.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@CrossOrigin("*")
	@PostMapping("/addcustomer")
	public @ResponseBody CustomerNoSQL addCustomer(@RequestBody CustomerNoSQL customer)
	{
		 return service.addCustomer(customer);
	}
	
	
	@CrossOrigin("*")
	@GetMapping("/getcustomers")
	public List<CustomerNoSQL> getAllCustomers()
	{
		 return service.getAllCustomers();
	}
	
	@CrossOrigin("*")
	@GetMapping("/getcustomerbyid/{mobileNo}")
	public CustomerNoSQL getCustomerById(@PathVariable("mobileNo") long mobileNo)
	{
		 return service.getCustomerByMobileNo(mobileNo);
	}
	
	@CrossOrigin("*")
	@DeleteMapping("/deletecustomerbyid/{mobileNo}")
	public void deleteCustomerById(@PathVariable("mobileNo") long mobileNo)
	{
		  service.deleteCustomer(mobileNo);
	}
	@CrossOrigin("*")
	@PutMapping("/updatecustomerbyid/{mobileNo}")
	public CustomerNoSQL updateCustomerById(@PathVariable("mobileNo") long mobileNo,@RequestBody CustomerNoSQL cust)
	{
		  CustomerNoSQL obj=service.getCustomerByMobileNo(mobileNo);
		  obj.setFirstName(cust.getFirstName());
		  obj.setLastName(cust.getLastName());
		  obj.setDob(cust.getDob());
		  obj.setAddress(cust.getAddress());
		  return service.addCustomer(obj);
		  
	}
	
	
}
