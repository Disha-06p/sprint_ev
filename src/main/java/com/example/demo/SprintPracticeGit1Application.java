package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintPracticeGit1Application {
	int a=10,b=20;
	public int add(int a,int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
	SpringApplication.run(SprintPracticeGit1Application.class, args);
		
		
	}

}
