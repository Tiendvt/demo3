package com.example.foodapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
//import com.example.foodapp.configs.MySiteMeshFilter;


@SpringBootApplication
public class FoodappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodappApplication.class, args);
	}
//	@Bean
//	public FilterRegistrationBean<MySiteMeshFilter> siteMeshFilter() {
//		FilterRegistrationBean<MySiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<MySiteMeshFilter>();
//		filterRegistrationBean.setFilter(new MySiteMeshFilter()); // adding sitemesh filter ??
//		filterRegistrationBean.addUrlPatterns("/*");
//		return filterRegistrationBean;
//	}
}
