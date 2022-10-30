package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：liming
 * @data: 2022/10/30 11:26
 **/
@RestController
public class TestController {

    @PostMapping(value = "/test")

    public String test(){
        return "你好啊！";
    }
}
