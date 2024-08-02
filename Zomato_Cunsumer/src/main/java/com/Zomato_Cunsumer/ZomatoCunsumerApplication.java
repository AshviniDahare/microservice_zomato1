package com.Zomato_Cunsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class ZomatoCunsumerApplication {

	public static void main(String[] args) {
		System.out.println("this is Zomato Application");
		SpringApplication.run(ZomatoCunsumerApplication.class, args);
	}
	@Bean
public RestTemplate rs() {
		RestTemplate rt=new RestTemplate();	
	return rt;
	
}
}
