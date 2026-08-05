package com.eazybytes.ex2.config;
import com.eazybytes.ex2.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
@Import({MobileConfig.class})
public class ProjectConfig1 {
    @Primary
    @Bean
    User u(){
        User u=new User();
        u.setName("Gopal");
        return u;
    }
    @Bean("swami")
    User u1(){
        User u=new User();
        u.setName("Gopalswami");
        return u;
    }
}
