package com.example.demo1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class User_Scrvice {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*
    插入数据到users表中
    */
    @RequestMapping("/inseruser")
    public String inseruser(String username, Integer age) {

        int update = jdbcTemplate.update("insert into users values(null,?,?)", username, age);

        return update > 0 ? "sucdes":"fail";
    }

    public static void main(String[] args) {
        SpringApplication.run(User_Scrvice.class,args);
    }

}