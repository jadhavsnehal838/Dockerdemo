package com.springdemo.helloworld.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestController
public class DockerdemoApplication {


@GetMapping("/")
    public String getMessage1(){
        return "Welcome to snehals world";
    }
    @GetMapping("/about_us")
    public String getMessage2(){
        return "Snehal love to annoy tushar";
    }
    @GetMapping("/contact_us")
    public String getMessage3(){
        return "My contact number is 7028094366";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerdemoApplication.class, args);
    }

}
