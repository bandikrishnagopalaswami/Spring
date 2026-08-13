package com.eazybytes.ex5AutoWiring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;
//    @Autowired field di
    @Autowired
   private  Engine engine;
    public Car(){
        System.out.println("Car bean created");
    }
    public Engine getEngine() {
        return engine;
    }
    //@Autowired // setter di
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initialise(){
        this.name="kia";
    }
}
