package com.eazybytes.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.eazybytes.task.config.*;
import com.eazybytes.task.beans.*;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("using bean method"+context.getBean(Student1.class).getName()+" "+context.getBean(Student1.class).getRoll());
        System.out.println("using component method"+context.getBean(Student.class).getName()+" "+context.getBean(Student.class).getRollno());

    }
}
