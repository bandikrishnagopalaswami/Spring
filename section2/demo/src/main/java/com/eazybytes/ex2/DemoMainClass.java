package com.eazybytes.ex2;

import com.eazybytes.ex2.beans.*;
import com.eazybytes.ex2.config.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainClass {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println(((Mobile)context.getBean("Motorola")).getName());
        System.out.println(context.getBean(Mobile.class).getName());
        System.out.println(context.getBean(User.class).getName());
        System.out.println(((Vehicle)context.getBean("tesla")).getName());
        System.out.println(((Vehicle)context.getBean("Maruthi")).getName());
        System.out.println(((Vehicle)context.getBean("suzuki")).getName());
        System.out.println(((Vehicle)context.getBean("Ferrari")).getName());
        System.out.println(((Vehicle)context.getBean("audi")).getName());
    }
}
