package com.example.springboot_test.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myControl {

    @RequestMapping("/")
    public String getStr(){
        return "index";
    }

}
