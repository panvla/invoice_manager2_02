package com.vladimirpandurov.invoice_manager2_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class InvoiceManager202Application {

	private static final int STRENGTH = 12;

	public static void main(String[] args) {
		SpringApplication.run(InvoiceManager202Application.class, args);
	}

	@Bean
	public BCryptPasswordEncoder encoder(){
		return new BCryptPasswordEncoder(STRENGTH);
	}

}
