package com.cloudtech.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestController")
public class TestController {

    @GetMapping("/message")
    @ResponseBody
    public JSONObject message() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1", "hello");
        return jsonObject;
    }

    @GetMapping("/mesage")
    @ResponseBody
    public String mesage() {
        return "bye";
    }

}
