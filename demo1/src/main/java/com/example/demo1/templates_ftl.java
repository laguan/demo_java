package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@EnableAutoConfiguration
@Controller
public class templates_ftl {
    @RequestMapping("/index_freemarkerIndex")
    public String freemarkerIndex(Map<String, String> result) {
        result.put("name", "tangmu");
        return "index1";
        /*
         * 调用模板
         * 要在配置文件里面配置查找的后追命   设置为spring.freemarker.suffix=.ftl
         * */
    }

    public static void main(String[] args) {
        SpringApplication.run(templates_ftl.class, args);
    }

}
