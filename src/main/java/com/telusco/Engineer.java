package com.telusco;

public class Engineer  {
    private String name;
    private Computer comp;

    public Engineer() {
        System.out.println("Engineer enters into the office");
    }

    public Engineer(String name, Computer comp) {
        System.out.println("Engineer is equipped with modern computer");
        this.name = name;
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void deliver() {
        System.out.println("Developing software by " + this.getName());
        comp.compile();
    }

}
