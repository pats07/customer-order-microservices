package com.customer.service.customerservice;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="order-service")
@RibbonClient(name="order-service")
public interface OrderServiceProxy {

	@GetMapping("/customers/{customerId}/orders")
	public List<Order> findAllOrdersByCustomerId(@PathVariable("customerId")Long customerId);

}
