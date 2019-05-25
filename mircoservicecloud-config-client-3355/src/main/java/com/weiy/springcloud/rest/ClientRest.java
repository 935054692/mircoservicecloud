package com.weiy.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRest {

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServer;

	@Value("${server.port}")
	private String port;

	@GetMapping("/config")
	public String getConfig() {
		StringBuffer str = new StringBuffer();
		str.append("applicationName:").append(applicationName).append("\r\n").append("eurekaServer:").append(eurekaServer)
				.append("\r\n").append("port:").append(port).append("\r\n");
		return str.toString();
	}

}
