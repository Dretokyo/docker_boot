package com.example.docker_boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 作者： BlackCat
 * 日期： 2023/12/7 21:52
 * 描述：
 */
@RestController
public class OrderController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/order/docker")
    public String helloDocker() {
        return "hello docker"+"\t"+port+"\t"+ UUID.randomUUID().toString();
    }

    @RequestMapping(value = "/order/index", method = RequestMethod.GET)
    public String index(){
        return "服务端口号："+"\t"+"port"+"\t"+UUID.randomUUID().toString();
    }

}
