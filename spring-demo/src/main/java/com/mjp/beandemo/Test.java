package com.mjp.beandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		Object car = context.getBean("car");
		System.out.println("beanDefinitionName:"+car);

		System.out.println("********************************************************");
		ApplicationContext contex=new ClassPathXmlApplicationContext("tx.xml");
		Object car1 = contex.getBean("car");
		System.out.println("car****:"+car1);


	}
}

