package com.mjp.beanpostprocessordemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.mjp.beanpostprocessordemo")
@Configuration
public class BeanConfig {
	@Bean
	public Person person() {
		return new Person("张三", "男");
	}
}
