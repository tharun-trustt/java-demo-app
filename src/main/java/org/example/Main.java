package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Marks this as Spring Boot main class
public class Main {

    public static void main(String[] args) {
        // Start Spring Boot application
        SpringApplication.run(Main.class, args);

        // Your regular code still works
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
