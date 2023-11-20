package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KantsuApiApplication {
    public static void main(String[] args) {
        System.out.pringln("hello test Action!!!");
        //SpringApplication.run(KantsuApiApplication.class, args);
    }
}
