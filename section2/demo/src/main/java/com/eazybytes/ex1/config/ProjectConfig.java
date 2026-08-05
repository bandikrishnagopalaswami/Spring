package com.eazybytes.ex1.config;
import com.eazybytes.ex1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConfig {
    @Bean
    Vehicle v(){
        Vehicle v=new Vehicle();
        v.setName("tesla");
        return v;
    }
    @Bean
    Vehicle v1(){
        Vehicle v1=new Vehicle();
        v1.setName("audi");
        return v1;
    }
    @Bean
    Vehicle v2(){
        Vehicle v2=new Vehicle();
        v2.setName("benz");
        return v2;
    }
    @Bean("Ferrari")
    Vehicle v3(){
        Vehicle v=new Vehicle();
        v.setName("Ferrari");
        return v;
    }
    @Bean
    String hello(){
        return "Hello World";
    }
}
