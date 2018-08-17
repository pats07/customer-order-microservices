package com.order.service.orderservice;

public class Order {

	
	private Long orderId;
	
	public Order() {}
	public Order(String orderName, String address) {
		super();
		this.orderName = orderName;
		this.address = address;
	}
	

	private String orderName;

	private String address;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	

}
