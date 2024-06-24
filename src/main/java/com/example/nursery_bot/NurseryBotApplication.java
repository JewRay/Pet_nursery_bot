package com.example.nursery_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class NurseryBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(NurseryBotApplication.class, args);
	}

}
