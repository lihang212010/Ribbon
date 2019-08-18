package com.example.demo;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoCloudConsumerApplication {

@Bean
 @LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	


@Bean
public RestTemplate commRestTemplate() {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
    return restTemplate;
}

	
	public static void main(String[] args) {
		SpringApplication.run(DemoCloudConsumerApplication.class, args);
	}

}
