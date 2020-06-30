package com.sspu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class SafeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SafeApplication.class, args);
    }

}
