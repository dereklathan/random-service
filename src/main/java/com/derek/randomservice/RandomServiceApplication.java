package com.derek.randomservice;

import com.derek.randomservice.rest.RandomRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomServiceApplication {

    @Autowired
    private RandomRestController randomRestController;
    
	public static void main(String[] args) {
		SpringApplication.run(RandomServiceApplication.class, args);
	}

}
