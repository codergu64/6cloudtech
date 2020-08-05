package com.cloudtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fanpengyue
 * @create 2020-08-05 9:05
 * @Description
 **/
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
