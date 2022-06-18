package com.longtao.docekrdemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.longtao.docekrdemo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:IndexController
 * @Description:代码即注释
 * @Author:taoLong
 * @Date:2022/6/18:21:35 星期六
 */
@RestController
@RequestMapping("/user")
public class IndexController {


    @GetMapping(value = "/index",produces = "application/json")
    public User index() {
        return User.builder().age(18).name("王聪聪").desc("这是一个非常帅气的人").build();
    }
}
