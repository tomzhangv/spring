package com.mjp;

import com.mjp.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.mjp.bean")
@Configuration
public class MyApplication {
	@Bean(value = "car")
	public Car getCar(){
		return new Car();
	}
}
