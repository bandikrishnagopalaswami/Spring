package com.eazybytes.task;

import com.eazybytes.task.beans.AlertSystem;
import com.eazybytes.task.beans.NotificationService;
import com.eazybytes.task.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.management.Notification;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        AlertSystem as=context.getBean(AlertSystem.class);
        as.executeAlert("Server CPU at 95%!");
        as.getNotificationService().send("gopal","Hello how r u");
        //System.out.println();
        context.close();
    }
}
