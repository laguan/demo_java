package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class configuration {

    /*
    * 读取配置文件里面的数据
    * 这里是读取resources/application.properties 这个文件里面的数据
    * */
    @Value("${mayikt.name}")
    private String name;
    @Value("${mayikt.age}")
    private String age;

    @RequestMapping("/configuration")
    public String configuration(){
        return "az";
    }

    /*
    * 接口读取配置文件
    * */
    @RequestMapping("/getconfiguration")  // 映射
    public String getconfiguration(){
        return name+"--"+age;
    }
}
