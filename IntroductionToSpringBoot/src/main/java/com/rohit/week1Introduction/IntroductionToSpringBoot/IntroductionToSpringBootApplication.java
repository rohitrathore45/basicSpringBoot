package com.rohit.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
		Apple obj = new Apple();
		obj.eating();
	}

}
