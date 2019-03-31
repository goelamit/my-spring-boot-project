package com.example.ag.dao;

import java.util.List;

import com.example.ag.model.Customer;

public interface RegisterationDAO {

	Customer createCustomer(Customer customer);
	List<Customer> getAllCustomers();
}
