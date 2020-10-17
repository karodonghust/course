package com.karo.aop.service;

import org.springframework.stereotype.Component;

@Component
public class OtherService {

	public void doSomeService(String name){
		System.out.println(name);
	}
}
