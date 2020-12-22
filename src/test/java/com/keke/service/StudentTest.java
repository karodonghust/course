package com.keke.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static final String CONFIG = "applicationContext-keke.xml";

    @Test
    public void configTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }

}
