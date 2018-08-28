package org.salgar.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDiscoveryClient
@ImportResource(locations = {"classpath:/META-INF/spring/org/salgar/v1_rest/applicationContext.xml"})
public class ProductServiceRestApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ProductServiceRestApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceRestApplication.class, args);
	}
}