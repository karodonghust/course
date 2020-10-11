package com.karo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	//	@Before(value = "execution(public void com.karo.aop.service.impl.SomeServiceImpl.doSomeService(..))")
	//	@Before(value = "execution(void com.karo.aop.service.impl.SomeServiceImpl.doSomeService(..))")
//	@Before(value = "execution(* *..SomeServiceImpl.doSomeService(..))")
//	@Before(value = "execution(* *..SomeServiceImpl.do*(..))")
//	@Before(value = "execution(* *..SomeServiceImpl.*(..))")
	@Before(value = "execution(* *..*Service*.*(..))")
	public void myBefore() {
		System.out.println("我是前置通知，我执行了");
	}
}
