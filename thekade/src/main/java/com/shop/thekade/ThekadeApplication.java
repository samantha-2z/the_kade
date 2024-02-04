package com.shop.thekade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.shop.thekade.entity")
public class ThekadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThekadeApplication.class, args);
	}

}
