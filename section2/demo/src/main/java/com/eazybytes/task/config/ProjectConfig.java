package com.eazybytes.task.config;

import com.eazybytes.task.beans.Student1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.eazybytes.task.beans")
public class ProjectConfig {
    @Bean
    Student1 createStudent(){
        Student1 s=new Student1();
        s.setName("Swami");
        s.setRoll(101);
        return s;
    }
}
