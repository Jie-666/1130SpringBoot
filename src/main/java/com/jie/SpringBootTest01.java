package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringBootTest01 {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello SpringBoot");
        return "hello SpringBoot";
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringBootTest01.class, args);
    }
}
