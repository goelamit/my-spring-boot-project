package com.example.ag.service;

import java.util.List;

import com.example.ag.model.Customer;

public interface RegisterationService {

	Customer createCustomer(Customer customer);
	List<Customer> getAllCustomers();
}
