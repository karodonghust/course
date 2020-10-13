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
}
