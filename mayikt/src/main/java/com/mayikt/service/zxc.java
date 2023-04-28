package com.mayikt.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableAutoConfiguration
@RestController
public class zxc {
    @RequestMapping("/zxc")
    public  String zxc(){
        return "zxc";
    }

    public static void main(String[] args) {
        SpringApplication.run(zxc.class,args);
    }
}
