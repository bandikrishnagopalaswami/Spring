package com.eazybytes.ex5AutoWiring;

import com.eazybytes.ex5AutoWiring.Config.ProjectConfig;
import com.eazybytes.ex5AutoWiring.beans.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println(context.getBean(Car.class).getEngine().getName());
        //System.out.println(context.getBean(Car1.class).getName());
    }
}
