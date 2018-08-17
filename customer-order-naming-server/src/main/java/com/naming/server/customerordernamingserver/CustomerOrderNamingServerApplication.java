package com.naming.server.customerordernamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CustomerOrderNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrderNamingServerApplication.class, args);
	}
}
