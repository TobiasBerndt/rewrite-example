package com.example.rewrite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.example.rewrite.controller.MyController;

@Configuration
public class RewriteConfiguration {
	@Bean
	@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public MyController myController() {
		return new MyController();
	}
}
