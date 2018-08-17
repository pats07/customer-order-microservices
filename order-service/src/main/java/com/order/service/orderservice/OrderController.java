package com.order.service.orderservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/customers/{customerId}/orders")
	public List<Order> findAllOrdersByCustomerId(@PathVariable("customerId")Long customerId) {
		
		Order order = new Order("Patit Order", "Bangalore");
		List<Order> list = new ArrayList<>();
		list.add(order);
		return list;
	}
	
	
}
