package com.serviceregistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregistiryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregistiryApplication.class, args);
	}

}
