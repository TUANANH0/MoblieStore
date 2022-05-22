package com.tuata.mobliestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.tuanta.mobliestore")
public class MoblieStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoblieStoreApplication.class, args);
	}

}
