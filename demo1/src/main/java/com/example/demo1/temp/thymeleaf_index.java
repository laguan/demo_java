package com.example.demo1.temp;

import com.example.demo1.entity.userentity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpServerErrorException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;
@EnableAutoConfiguration
@Controller
public class thymeleaf_index {
    @RequestMapping("/mythywmeleaf")
    public String mythymeleaf(HttpServletRequest request, Map<String,Object> result){

//        request.setAttribute("user",new userentity("mayikt","22"));
        result.put("user",new userentity("mayikt",22));

        ArrayList<userentity> userentities = new ArrayList<>();
        userentities.add(new userentity("mayikt1",22));
        userentities.add(new userentity("mayikt2",22));
        userentities.add(new userentity("mayikt3",22));
        result.put("userlist",userentities);

        return "mythymeleaf";
    }

    public static void main(String[] args) {
        SpringApplication.run(thymeleaf_index.class,args);
    }
}
