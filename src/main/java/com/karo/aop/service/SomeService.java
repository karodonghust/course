package com.karo.aop.service;

import java.util.Map;

public interface SomeService {

	public void doSomeService(String name);

	public Map returnSomething();

	public void doFist(String name);

	public void throwSomeThing(String name) throws Exception;

	void doEnd(String name);
}
