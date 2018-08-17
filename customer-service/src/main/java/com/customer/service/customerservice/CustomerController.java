package com.customer.service.customerservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private OrderServiceProxy proxy;
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> findAllCustomers() {
		
		return null;
	}
		
	@GetMapping("/customers/{id}/orders")
	public ResponseEntity<List<Order>> findAllOrdersByCustomerId(
			@PathVariable("id")Long customerId) {
		logger.info("Customer orders by customerid :{}",customerId);
		List<Order> list = proxy.findAllOrdersByCustomerId(customerId);
		ResponseEntity<List<Order>> response = new ResponseEntity<>(list,HttpStatus.OK);
		return response;
	}
		
	
}
