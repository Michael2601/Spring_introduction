package com.bsac.spring.model;

public class HelloForm {

    private String name;

    public HelloForm() {
        this.name = "Hello World!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
