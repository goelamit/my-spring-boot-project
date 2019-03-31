package com.example.ag.rest;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.ag.model.Customer;
import com.example.ag.service.RegisterationService;

@RestController
public class RegisterationRest {

	@Autowired
	private RegisterationService registerService;

	@GetMapping("/customers/all")
	public List<Customer> getAll() {
		
		return registerService.getAllCustomers();
	}
	@PostMapping("/customers")
	public ResponseEntity<Object> createCustomer(@Valid @RequestBody Customer customer) {
		Customer cust = registerService.createCustomer(customer);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cust.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
