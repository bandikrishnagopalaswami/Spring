package com.eazybytes.ex4ManualDI.config;

import com.eazybytes.ex4ManualDI.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConfig {
    @Bean
    Vehicle createVehicle(){
        Vehicle v=new Vehicle();
        v.setName("Benz");
        return v;
    }
    @Bean()
    Person createPerson(Vehicle v){
        Person p=new Person();
        p.setName("gopal");
        p.setVehicle(v);
        return p;
    }
//    @Bean
//    Person createPerson(){
//        Person p=new Person();
//        p.setName("swami");
//        p.setVehicle(createVehicle());
//        return p;
//    }
}
