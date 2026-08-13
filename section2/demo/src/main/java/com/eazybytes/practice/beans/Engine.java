package com.eazybytes.practice.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initialise(){
        this.name="v8";
    }
}
