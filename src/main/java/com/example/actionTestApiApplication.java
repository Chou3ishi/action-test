package com.kantsu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Taku Kyo
 * @version 1.0
 */
@SpringBootApplication
@EnableScheduling
public class KantsuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KantsuApiApplication.class, args);
    }
}
