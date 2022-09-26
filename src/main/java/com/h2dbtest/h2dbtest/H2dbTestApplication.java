package com.h2dbtest.h2dbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableWebMvc
public class H2dbTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2dbTestApplication.class, args);
    }

}
