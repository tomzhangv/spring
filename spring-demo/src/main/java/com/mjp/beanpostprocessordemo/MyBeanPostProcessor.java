package com.mjp.beanpostprocessordemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean,
												  String beanName) throws BeansException {
		System.out.println("[MyBeanPostProcessor]后置处理器处理bean=【" + beanName + "】开始");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean,
												 String beanName) throws BeansException {
		System.out.println("[MyBeanPostProcessor]后置处理器处理bean=【" + beanName + "】完毕!");
		return bean;
	}
}
