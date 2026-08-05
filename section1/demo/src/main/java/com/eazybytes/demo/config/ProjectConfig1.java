package com.eazybytes.demo.config;
import com.eazybytes.demo.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig1 {
    @Bean
    User createUser(){
        User u=new User();
        u.setName("gopal");
        return u;
    }
}
