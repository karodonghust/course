package com.karo.xmlIoc.service;

import com.karo.xmlIoc.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceTest {
    private static final String config = "ApplicationContext.xml";


    @Test
    public void doSomeTest(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void doSomeTestBySpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) context.getBean("someService");
        service.doSome();
    }

    @Test
    public void getMessage(){
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        System.out.println("容器中对象数量：" + context.getBeanDefinitionCount());
        for(int i=0;i<context.getBeanDefinitionCount();i++){
            System.out.println("容器中对象的名称：" + context.getBeanDefinitionNames()[i]);
        }
    }

    @Test
    public void detailTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student mystudent = (Student)context.getBean("student");
        System.out.println(mystudent.toString());
    }

    @Test
    public void schoolTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        System.out.println("-----spring context init already----");
        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }
}
