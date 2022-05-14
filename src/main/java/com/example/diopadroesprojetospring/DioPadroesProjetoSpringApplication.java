package com.example.diopadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DioPadroesProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DioPadroesProjetoSpringApplication.class, args);
    }

}
