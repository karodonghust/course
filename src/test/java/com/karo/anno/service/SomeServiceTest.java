package com.karo.anno.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceTest {
    private static final String config = "anno/ApplicationContext.xml";

    @Test
    public void studentTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = (Student)context.getBean("myStudent");
        System.out.println(student);
    }

}
