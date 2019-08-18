package com.example.demo;

import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.detDSA;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import ch.qos.logback.classic.Logger;



@RestController
public class MoviesController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient dis;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@RequestMapping("/user/{id}")
	public Users findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://demo-cloud-user/"+id, Users.class);
	}
		
	@RequestMapping("/user-instance")
	public List<ServiceInstance> showIndo(){
		return this.dis.getInstances("demo-cloud-user");//另一个微服务的id
		
	}  
}
