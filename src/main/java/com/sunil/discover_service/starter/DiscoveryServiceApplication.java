package com.sunil.discover_service.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication extends SpringBootServletInitializer
{
	
	private static final Logger log = LoggerFactory.getLogger(DiscoveryServiceApplication.class);

	public static void main(String[] args) 
	{
		log.info("Application Starting");
		SpringApplication.run(DiscoveryServiceApplication.class, args);
		log.info("Application Started");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
		return application.sources(DiscoveryServiceApplication.class);
	}

}
