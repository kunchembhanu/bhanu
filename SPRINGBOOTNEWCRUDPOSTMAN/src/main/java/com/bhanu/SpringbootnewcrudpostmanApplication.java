package com.bhanu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.bhanu.controller"})
public class SpringbootnewcrudpostmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootnewcrudpostmanApplication.class, args);
		System.out.println("hai");
	}

}
