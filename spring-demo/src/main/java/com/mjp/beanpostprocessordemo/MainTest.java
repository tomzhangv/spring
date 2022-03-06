package com.mjp.beanpostprocessordemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Person bean = context.getBean(Person.class);
		System.out.println(bean.toString());
		context.close();
	}
}
