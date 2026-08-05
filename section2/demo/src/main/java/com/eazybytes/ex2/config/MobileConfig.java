package com.eazybytes.ex2.config;
import com.eazybytes.ex2.beans.Mobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class MobileConfig {
    @Bean("Motorola")
    Mobile launchNewMobile(){
        Mobile m=new Mobile();
        m.setName("Motorola");
        return m;
    }
    @Primary
    @Bean
    Mobile discountMobile(){
        Mobile m=new Mobile();
        m.setName("Apple");
        return m;
    }

}
