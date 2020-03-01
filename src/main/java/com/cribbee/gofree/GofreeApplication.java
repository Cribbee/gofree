package com.cribbee.gofree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication

public class GofreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GofreeApplication.class, args);
	}

}
