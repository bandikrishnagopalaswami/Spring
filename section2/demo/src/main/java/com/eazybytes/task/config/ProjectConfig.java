package com.eazybytes.task.config;

import com.eazybytes.task.beans.AuditLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.eazybytes.task.beans")
public class ProjectConfig {
    @Bean
    AuditLogger a(){
        System.out.println("audit logger");
        return new AuditLogger();
    }
}
