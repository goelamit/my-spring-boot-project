package com.example.ag.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ag.dao.RegisterationDAO;
import com.example.ag.model.Customer;
import com.example.ag.repository.CustomerRepository;

@Component
public class RegisterationDAOImpl implements RegisterationDAO {

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Customer createCustomer(Customer customer) {
		
		return repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return repository.findAll();
	}

}
