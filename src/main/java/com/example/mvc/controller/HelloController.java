package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    //    "/" --> /WEB-INF/template/index.html
    @RequestMapping(value = "/")
    public String index() {
        // 返回視圖名稱
        return "index";
    }
}
