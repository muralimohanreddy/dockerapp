package com.cgi.banking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cgi.banking.models.Customer;
import com.cgi.banking.models.CustomerNoSQL;
import com.cgi.banking.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	//insert
	
	public CustomerNoSQL addCustomer(CustomerNoSQL customer)
	{
		return repo.save(customer);
	}
	
	//select all
	
	public List<CustomerNoSQL> getAllCustomers()
	{
		return repo.findAll();
	}
	
	//select customer by id
	public CustomerNoSQL getCustomerById(long id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//delete
	public void deleteCustomer(long id)
	{
		repo.deleteByMobileNo(id);
	}
	
	//update
	public CustomerNoSQL updateCustomer(long id, CustomerNoSQL customer)
	{
		
		CustomerNoSQL obj=getCustomerById(id);
		obj=customer;
		return repo.save(obj);		
		
	}
	
	//find by mobile no
	
	public CustomerNoSQL getCustomerByMobileNo(long mobileNo)
	{
		return repo.findByMobileNo(mobileNo);
	}
	
	

}
