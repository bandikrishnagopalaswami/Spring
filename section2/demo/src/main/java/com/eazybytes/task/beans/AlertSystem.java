package com.eazybytes.task.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AlertSystem {
     private final NotificationService notificationService;
    AlertSystem(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public void executeAlert(String alert){
        notificationService.send("gopal",alert);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
