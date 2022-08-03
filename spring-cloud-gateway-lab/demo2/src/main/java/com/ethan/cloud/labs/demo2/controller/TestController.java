package com.ethan.cloud.labs.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhenghui
 * @Description 测试控制器
 * @Date 2022/8/3
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @GetMapping(value = "/hello")
    public String sayHello() {
        return "欢迎您，访问demo2服务";
    }
}
