package com.jorgesaldivar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.jorgesaldivar.config.RibbonTimeConfig;

@RibbonClient(name = "time-service", configuration=RibbonTimeConfig.class)
@SpringBootApplication
public class RibbonTimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonTimeAppApplication.class, args);
	}
}
