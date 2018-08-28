package org.salgar.service.healthchecker;

import javax.inject.Named;

import org.salgar.healthcheck.RestHealthIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HealtCheckerV2Factory {
	@Autowired
	@Named("proxyProductService")
	org.salgar.product.api.v2.ProductService productService;
	
	@Bean
	public RestHealthIndicator<org.salgar.product.api.v2.ProductService> getHealtIndicator() {
		return new RestHealthIndicator<org.salgar.product.api.v2.ProductService>(productService);
	}
}