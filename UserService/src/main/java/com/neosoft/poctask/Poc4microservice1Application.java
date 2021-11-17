package com.neosoft.poctask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.neosoft.poctask.model.User;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
//@ComponentScan({ "com.neosoft.poctask.repository" })
public class Poc4microservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Poc4microservice1Application.class, args);

		System.out.println("microservice1");

	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
