package com.eazybytes.ex1;

import com.eazybytes.ex1.beans.Vehicle;
import com.eazybytes.ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainClass {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle v1=context.getBean("v",Vehicle.class);
        Vehicle v2=(Vehicle) context.getBean("v1");
        System.out.println(v1.getName()+" "+v2.getName());
    }
}
