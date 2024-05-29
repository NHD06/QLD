package com.example.QLD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.QLD.model.StudentAccount;

@SpringBootApplication
public class QldApplication {

	public static void main(String[] args) {
		SpringApplication.run(QldApplication.class, args);
	}
	@Bean(name = "USER_BEAN")
	public StudentAccount setUser(){
		StudentAccount user = new StudentAccount();
		user.setUsername("admin");
		user.setPassword("123456");
		return user;
	}
}
