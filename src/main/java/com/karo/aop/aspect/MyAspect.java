package com.karo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Aspect
public class MyAspect {

	//	@Before(value = "execution(public void com.karo.aop.service.impl.SomeServiceImpl.doSomeService(..))")
	//	@Before(value = "execution(void com.karo.aop.service.impl.SomeServiceImpl.doSomeService(..))")
//	@Before(value = "execution(* *..SomeServiceImpl.doSomeService(..))")
//	@Before(value = "execution(* *..SomeServiceImpl.do*(..))")
//	@Before(value = "execution(* *..SomeServiceImpl.*(..))")
	@Before(value = "execution(* *..*Service*.doSomeService(..))")
	public void myBefore() {
		System.out.println("我是前置通知，我执行了");
	}

	@Before(value = "execution(* *..*Service*.doSomeService(..))")
	public void otherBefore(JoinPoint joinPoint){
		System.out.println(joinPoint.toLongString());
		System.out.println(joinPoint.getArgs());
	}

	/**
	 *
	 * @param res
	 */

	@AfterReturning(value = "execution(* *..*Service*.returnSomething(..))",returning="res")
	public void myAfterReturning(Object res){
		((Map<String, String>) res).put("returnString","我是业务方法返回结果,我被返回通知修改了");
		System.out.println("我是返回通知，我执行了");
	}
}
