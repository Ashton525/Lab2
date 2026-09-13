package com.cashieas.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Lab2Application.class, args);
        var notificationManager = context.getBean(NotificationManager.class);
        notificationManager.sendNotification("Hello, this is a test message!");
    }

}
