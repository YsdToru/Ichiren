package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.impl.UserLoginServiceImpl;

@Configuration
public class AppConfig {
	
	
	
	@Bean(name = "userService")
	UserLoginServiceImpl UserLoginService() {
		return new UserLoginServiceImpl();
	}

}
