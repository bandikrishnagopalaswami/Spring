package com.eazybytes.practice.config;

import com.eazybytes.practice.beans.Engine;
import com.eazybytes.practice.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.eazybytes.practice.beans")
public class ProjectConfig {
//    @Bean
//    Vehicle v(){
//        Vehicle v=new Vehicle();
//        v.setName("Maruthi suzuki");
//        return v;
//    }
//    @Bean
//    Engine e(){
//        Engine e=new Engine();
//        e.setName("v8");
//        return e;
//    }
}
