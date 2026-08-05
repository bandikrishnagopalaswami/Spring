package com.eazybytes.ex3.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle implements postdestroy{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
}
