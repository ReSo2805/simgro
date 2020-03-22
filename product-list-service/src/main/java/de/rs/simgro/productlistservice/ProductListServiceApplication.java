package de.rs.simgro.productlistservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductListServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductListServiceApplication.class, args);
	}

}
