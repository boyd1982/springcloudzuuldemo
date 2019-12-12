package com.example.springcloudzuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudzuuldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudzuuldemoApplication.class, args);
    }

}
