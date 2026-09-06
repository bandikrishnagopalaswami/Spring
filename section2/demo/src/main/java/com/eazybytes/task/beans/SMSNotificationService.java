package com.eazybytes.task.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String recipient, String Message) {
        System.out.println(recipient+Message+"SMS");
    }
//    @PostConstruct
//    public void init(){
//        System.out.println("SMS Server Connected");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("SMS Server Disconnected");
//    }
}
