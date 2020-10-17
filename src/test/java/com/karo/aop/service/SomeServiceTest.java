package com.karo.aop.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceTest {
	private static final String config = "aop/ApplicationContext.xml";

	@Test
	public void doSomeTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		SomeService someService = (SomeService) context.getBean("someServiceImpl");
		System.out.println(someService.getClass().getName());
		someService.doSomeService("我是一个service");
	}

	@Test
	public void returnTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		SomeService someService = (SomeService) context.getBean("someServiceImpl");
		System.out.println(someService.returnSomething());
	}

	@Test
	public void aroundTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		SomeService someService = (SomeService) context.getBean("someServiceImpl");
		someService.doFist("我是业务方法，我执行了");
	}

	@Test
	public void afterThrowingTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		SomeService someService = (SomeService) context.getBean("someServiceImpl");
		try {
			someService.throwSomeThing("我是业务方法，我执行了");
		} catch (Exception e) {
			System.out.println("我在业务执行中捕捉了异常" + e.getMessage());
		}
	}


	@Test
	public void afterTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		SomeService someService = (SomeService) context.getBean("someServiceImpl");
		System.out.println(someService.getClass().getName());
		someService.doEnd("我是业务方法，我执行了");
	}

	@Test
	public void otherServiceTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		OtherService otherService = (OtherService) context.getBean("otherService");
		System.out.println(otherService.getClass().getName());
		otherService.doSomeService("我是业务方法，我执行了");
	}
}
