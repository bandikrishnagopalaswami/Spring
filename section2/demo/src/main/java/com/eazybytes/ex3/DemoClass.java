package com.eazybytes.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.eazybytes.ex3.config.*;
import com.eazybytes.ex3.beans.*;
public class DemoClass {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println(context.getBean(Vehicle.class).getName());
       // context.getBean(Vehicle.class).sayHello();
        context.getBean(Vehicle.class).initialise();
        context.close();
    }
}
