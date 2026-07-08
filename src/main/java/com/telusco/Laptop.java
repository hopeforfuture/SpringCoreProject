package com.telusco;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop Object Created");
    }

    public void compile() {
        System.out.println("Compiling application using Laptop...");
    }
}
