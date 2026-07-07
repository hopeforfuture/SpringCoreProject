package com.telusco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Engineer eng = (Engineer) context.getBean(Engineer.class);
        eng.deliver();
    }
}
