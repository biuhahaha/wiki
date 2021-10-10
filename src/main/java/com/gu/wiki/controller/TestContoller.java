package com.gu.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController 一般用来返回字符串
 * Controller       返回页面
 * */
@RestController
public class TestContoller {

    /**
     * RequestMapping 支持所有的请求方式
     * */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring!";
    }
}
