package com.telusco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

    private int age;
    @Autowired
    @Qualifier("desktop")
    private Computer comp;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public Alien(int age, Computer comp) {
        System.out.println("constructor calling for alien obj3");
        this.age = age;
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        System.out.println("Coding...");
        comp.compile();
    }
}
