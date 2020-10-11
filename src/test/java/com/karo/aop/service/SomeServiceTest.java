package com.karo.aop.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceTest {
	private static final String config = "aop/ApplicationContext.xml";

	@Test
	public void doSomeTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		SomeService someService = (SomeService)context.getBean("someServiceImpl");
		System.out.println(someService.getClass().getName());
		someService.doSomeService("我是一个service");
	}
}
