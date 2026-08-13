package com.eazybytes.practice.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    private final Engine engine;
    @Autowired
    public Vehicle(Engine engine){
        this.engine=engine;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Engine getEngine() {
        return engine;
    }
//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
    @PostConstruct
    public void initialise(){
        this.name="maruthi suzuki";
    }
}
