package com.telusco;

public class Alien {

    private int age;
    private Laptop lap;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public void code() {
        lap.compile();
        System.out.println("Code...");
    }
}
