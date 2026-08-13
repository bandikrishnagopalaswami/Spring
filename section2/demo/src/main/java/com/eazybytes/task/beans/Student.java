package com.eazybytes.task.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int rollno;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    @PostConstruct
    public void init(){
        this.name="gopal";
        this.rollno=101;
    }
}
