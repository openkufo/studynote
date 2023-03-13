package com.study.studynote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudynoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudynoteApplication.class, args);
		System.out.println("브라우저 열기 -> http://localhost:8081");
	}

}
