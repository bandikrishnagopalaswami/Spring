package com.eazybytes.practice;

import com.eazybytes.practice.beans.Vehicle;
import com.eazybytes.practice.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle v1=context.getBean(Vehicle.class);
        System.out.println(v1.hashCode()+" "+v1.getName()+" "+v1.getEngine().getName());
    }
}
