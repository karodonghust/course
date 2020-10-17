package com.karo.aop.service.impl;

import com.karo.aop.service.SomeService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SomeServiceImpl implements SomeService {

	public void doSomeService(String name) {
		System.out.println(name + "我执行了");
	}

	public Map returnSomething() {
		System.out.println("我是业务方法");
		Map map = new HashMap();
		map.put("returnString", "我是业务方法返回结果");
		return map;
	}

	public void doFist(String name){
		System.out.println(name);
	}

	public void throwSomeThing(String name) throws Exception {
		System.out.println(name);
		throw new Exception("我是业务方法抛出来的异常");
	}

	public void doEnd(String name){
		System.out.println(name);
	}
}
