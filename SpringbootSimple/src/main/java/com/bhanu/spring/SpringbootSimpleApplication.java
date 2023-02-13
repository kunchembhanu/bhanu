package com.bhanu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSimpleApplication 
{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSimpleApplication.class, args);
		System.out.println("Fine.");
	}

}
