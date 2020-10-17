package com.karo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

	@Around(value = "execution(* *..*Service*.doFist(..))")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = null;
		System.out.println("我是环绕通知，我在目标方法之前工作了,且业务第一个参数值是：" + joinPoint.getArgs()[0]);
		result = joinPoint.proceed();
		System.out.println("我是环绕通知，我在目标方法之后工作了，且业务放回参数是" + result);
		return result;
	}



	@AfterThrowing(value = "execution(* *..*Service*.throwSomeThing(..))",throwing = "ex")
	public void myThrow(Exception ex) throws Throwable {
		System.out.println("我是切片方法我捕捉到了业务异常：" + ex.getMessage());
	}

	@After(value = "myPointcut()")
	public void myAfter(){
		System.out.println("我是最终通知，我执行了");
	}

	@Pointcut(value = "execution(* *..*Service*.doEnd(..))")
	private void myPointcut(){}

	@Around(value = "execution(* *..*.*(..))")
	public Object otherAround(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = null;
		System.out.println("我是环绕通知，我在目标方法之前工作了,且业务第一个参数值是：" + joinPoint.getArgs()[0]);
		result = joinPoint.proceed();
		System.out.println("我是环绕通知，我在目标方法之后工作了，且业务放回参数是" + result);
		return result;
	}
}
