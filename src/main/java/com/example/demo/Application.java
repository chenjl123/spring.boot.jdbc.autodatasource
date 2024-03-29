package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.demo.datasource.DynamicDataSourceRegister;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class Application{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
