package com.eazybytes.task.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String recipient, String Message) {
        System.out.println(recipient+Message+"Email");
    }
    @PostConstruct
    public void init(){
        System.out.println("Email Server Connected");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Email Server Disconnected");
    }
}
