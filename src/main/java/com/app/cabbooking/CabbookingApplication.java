package com.app.cabbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CabbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabbookingApplication.class, args);
	}

}
