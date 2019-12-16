package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example")
public class CouseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run( CouseApiApp.class, args);

	}

}
