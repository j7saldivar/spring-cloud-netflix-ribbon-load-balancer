package com.jorgesaldivar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Autowired {@link RestTemplate} 
 * with {@link LoadBalanced} so it could use the load balancer.
 * 
 * @author saldivar
 *
 */
@RestController
public class MainRibbonAppController {

	private RestTemplate restTemplate;

	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@RequestMapping
	public String getTime() {
		return restTemplate.getForEntity("http://time-service", String.class).getBody();
	}
	
}
