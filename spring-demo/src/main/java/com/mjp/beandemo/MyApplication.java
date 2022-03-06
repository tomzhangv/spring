package com.mjp.beandemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.mjp.beandemo")
@Configuration
public class MyApplication {
	@Bean(value = "car")
	public Car getCar(){
		return new Car();
	}
}
