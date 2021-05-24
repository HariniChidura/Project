package com.cg.onlinepizza.customer.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinepizza.customer.dto.Customer;
import com.cg.onlinepizza.exceptions.CustomerIdNotFoundException;
import com.cg.onlinepizza.customer.dao.*;


@Service
public class ICustomerService {
	@Autowired
	ICustomerRepository ICustomerRepository;
	public Customer addCustomer(Customer customer) {
		return ICustomerRepository.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return ICustomerRepository.save(customer);
	}

	public void deleteCustomer(int customerId) throws CustomerIdNotFoundException{
		try {
			ICustomerRepository.deleteById(customerId);
		}
		catch(Exception e) {
			throw new CustomerIdNotFoundException("Customer Id not present in table");
		}
	}
	
	public Customer viewCustomer1(int customerId) throws CustomerIdNotFoundException{
		try {
			return ICustomerRepository.findById(customerId).get();
		}
		catch(Exception e) {
			throw new CustomerIdNotFoundException("Customer Id not present in table");
		}
	}

	public List<Customer> viewCustomers(){
		List<Customer> customer = new ArrayList<Customer>();
		ICustomerRepository.findAll().forEach(customer1 -> customer.add(customer1));
		return customer;
	}

}
