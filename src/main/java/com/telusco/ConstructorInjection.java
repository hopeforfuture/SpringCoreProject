package com.telusco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)context.getBean("alien3");
        System.out.println("Age: " + obj.getAge());
        obj.code();
    }
}
