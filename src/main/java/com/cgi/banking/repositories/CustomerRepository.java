package com.cgi.banking.repositories;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.cgi.banking.models.Customer;
import com.cgi.banking.models.CustomerNoSQL;

/*public interface CustomerRepository extends JpaRepository<Customer,Long>{

	@Query("select  c from Customer c where c.mobileNo=:no")
	public Customer findByMobileNo(@Param("no") long no);
	
	
}
*/

public interface CustomerRepository extends MongoRepository<CustomerNoSQL,Long>{

	@Query("{mobileNo : ?0}")
	public CustomerNoSQL findByMobileNo(@Param("no") long no);
	
	@Query(value="{mobileNo : ?0}", delete = true)
	public void deleteByMobileNo(@Param("no") long no);
	
	
	
	
}