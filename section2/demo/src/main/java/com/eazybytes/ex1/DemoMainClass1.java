package com.eazybytes.ex1;
import com.eazybytes.ex1.beans.User;
import com.eazybytes.ex1.config.ProjectConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainClass1 {
    public static void main(String[] args) {
        var user = new AnnotationConfigApplicationContext(ProjectConfig1.class);
        System.out.println(user.getBean(User.class).getName());
    }
}
