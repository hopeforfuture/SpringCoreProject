package com.telusco;

import org.springframework.stereotype.Component;

@Component("desktop")
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop Object Created");
    }

    public void compile() {
        System.out.println("Compiling application using Desktop...");
    }
}
