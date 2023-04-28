package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableAutoConfiguration
@RestController
public class asd {
    @RequestMapping("/zxc")
    public String asd(){
        return "zxc";
    }

    public static void main(String[] args) {
        SpringApplication.run(asd.class,args);
    }
}
