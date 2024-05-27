package com.learning;

import com.learning.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootGrpcServerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGrpcServerExampleApplication.class, args);

    }

}
