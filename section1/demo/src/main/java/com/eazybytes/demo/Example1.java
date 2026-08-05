package com.eazybytes.demo;

import com.eazybytes.demo.beans.Vehicle;
import com.eazybytes.demo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setName("Audi");
        System.out.println("Vehicle name from non spring context "+v.getName());
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println(context.getBean(Vehicle.class).getName());
        System.out.println(context.getBean(String.class));
        Vehicle v1=context.getBean(Vehicle.class);
        System.out.println(v1.getName());
        //System.out.println(context.getBean(Double.class));
    }
}
