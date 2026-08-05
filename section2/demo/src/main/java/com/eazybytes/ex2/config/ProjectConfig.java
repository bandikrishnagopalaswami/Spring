package com.eazybytes.ex2.config;
import com.eazybytes.ex2.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
@Import({ProjectConfig1.class})
public class ProjectConfig {
    @Bean(name="tesla")
    Vehicle v(){
        Vehicle v=new Vehicle();
        v.setName("tesla");
        return v;
    }
    @Bean(value="audi")
    Vehicle v1(){
        Vehicle v1=new Vehicle();
        v1.setName("audi");
        return v1;
    }
    @Bean({"Maruthi","suzuki"})
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
//    @Primary
//    @Bean
//    User u(){
//        User u=new User();
//        u.setName("Gopal");
//        return u;
//    }
//    @Bean("swami")
//    User u1(){
//        User u=new User();
//        u.setName("Gopalswami");
//        return u;
//    }
}
