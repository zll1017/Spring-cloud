package com.example.springcloud.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@EnableEurekaClient
@Configuration
@RestController
@SpringBootApplication
public class EurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1Application.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}
	@Resource
	RestTemplate restTemplate;

	@GetMapping("/test")
	public String get(){
		return restTemplate.getForObject("http://eureka-client/test",String.class);
	}
}
