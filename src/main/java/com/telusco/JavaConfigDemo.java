package com.telusco;

import com.telusco.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        obj1.setAge(38);
        System.out.println(obj1.getAge());
        obj1.code();
        System.out.println("---------------------------------------");
        Desktop dt = context.getBean( Desktop.class);
        dt.compile();

        //Desktop dt1 = context.getBean("desktop", Desktop.class);
        //dt1.compile();
    }
}
