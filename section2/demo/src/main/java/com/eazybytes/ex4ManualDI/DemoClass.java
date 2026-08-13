package com.eazybytes.ex4ManualDI;

import com.eazybytes.ex4ManualDI.beans.*;
import com.eazybytes.ex4ManualDI.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClass {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println(context.getBean(Person.class).getVehicle().getName());
        //System.out.println(((Person)context.getBean("person")).getVehicle().getName());
        System.out.println(context.getBean(Person.class).getName());
    }
}
