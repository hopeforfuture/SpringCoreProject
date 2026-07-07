package com.telusco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien2");
        Alien obj2 = (Alien) context.getBean("alien2");

        //obj2.age = 25;
        System.out.println("obj1.age: " + obj1.getAge());
        System.out.println("obj2.age: " + obj2.getAge());
    }
}
