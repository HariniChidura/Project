package com.cg.onlinepizza.customer.dao;

import java.util.List;

import com.cg.onlinepizza.customer.dto.Customer;
import com.cg.onlinepizza.exceptions.CustomerIdNotFoundException;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer,Integer>{
	//Customer addCustomer(Customer customer);

	//Customer updateCustomer(Customer customer);

	//Customer deleteCustomer(int customerId) throws CustomerIdNotFoundException;

	//List<Customer> viewCustomers();

	//Customer viewCustomer(int customerId) throws CustomerIdNotFoundException;

}
