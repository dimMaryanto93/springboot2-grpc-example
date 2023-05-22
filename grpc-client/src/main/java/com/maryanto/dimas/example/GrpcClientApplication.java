package com.maryanto.dimas.example;

import com.maryanto.dimas.example.service.LoggingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GrpcClientApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(GrpcClientApplication.class, args);
        LoggingService logging = ctx.getBean(LoggingService.class);
        String value = logging.receiveGreeting("Hi, my name is");
        System.out.println(value);
    }
}
