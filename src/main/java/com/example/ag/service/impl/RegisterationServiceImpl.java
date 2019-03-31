package com.example.ag.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ag.dao.RegisterationDAO;
import com.example.ag.model.Customer;
import com.example.ag.service.RegisterationService;

@Service
public class RegisterationServiceImpl implements RegisterationService {

	@Autowired
	private RegisterationDAO registerDAO;

	@Override
	public Customer createCustomer(Customer customer) {

		return registerDAO.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return registerDAO.getAllCustomers();
	}

}
