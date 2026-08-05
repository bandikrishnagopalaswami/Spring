package com.eazybytes.demo;
import com.eazybytes.demo.beans.User;
import com.eazybytes.demo.config.ProjectConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class DemoMainClass1 {
    public static void main(String[] args) {
        var user = new AnnotationConfigApplicationContext(ProjectConfig1.class);
        System.out.println(user.getBean(User.class).getName());
    }
}
