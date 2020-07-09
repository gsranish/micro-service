package com.gsr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BrandDemoPortalApplication {
	
	private static Logger LOG=LoggerFactory.getLogger(BrandDemoPortalApplication.class);
	
	public static void main(String[] args) {
		
		LOG.info(" BrandDemoPortalApplication application started : "+System.currentTimeMillis());
		SpringApplication.run(BrandDemoPortalApplication.class, args);
	}

}
