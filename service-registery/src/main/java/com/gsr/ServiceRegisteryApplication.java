package com.gsr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisteryApplication {
	
	private static Logger LOG=LoggerFactory.getLogger(ServiceRegisteryApplication.class);

	public static void main(String[] args) {
		
		LOG.info("ServiceRegisteryApplication started at :");
		SpringApplicationBuilder builder=(SpringApplicationBuilder) new SpringApplicationBuilder(ServiceRegisteryApplication.class).run(args);
		LOG.info(" SpringApplicationBuilder : " +builder.toString());
		SpringApplication.run(ServiceRegisteryApplication.class, args);
	}

}
