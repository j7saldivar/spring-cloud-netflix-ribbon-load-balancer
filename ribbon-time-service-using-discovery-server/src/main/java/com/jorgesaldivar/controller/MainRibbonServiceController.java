package com.jorgesaldivar.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRibbonServiceController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping
	public String getTime() {
		return String.join(" ","The current time is", new Date().toString(), "answered by port: ", port);
	}
	
}
