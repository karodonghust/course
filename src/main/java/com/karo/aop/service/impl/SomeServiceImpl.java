package com.karo.aop.service.impl;

import com.karo.aop.service.SomeService;
import org.springframework.stereotype.Component;

@Component
public class SomeServiceImpl implements SomeService {

	public void doSomeService(String name) {
		System.out.println(name + "我执行了");
	}
}
