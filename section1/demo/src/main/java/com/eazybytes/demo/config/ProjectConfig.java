package com.eazybytes.demo.config;
import com.eazybytes.demo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConfig {
    @Bean
    Vehicle v(){
        Vehicle v1=new Vehicle();
        v1.setName("tesla");
        return v1;
    }
    @Bean
    String hello(){
        return "Hello World";
    }
}
