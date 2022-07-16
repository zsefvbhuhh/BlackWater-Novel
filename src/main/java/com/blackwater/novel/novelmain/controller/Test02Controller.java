package com.blackwater.novel.novelmain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller02
 * @author by MechellWater
 * @date : 2022-07-16 15:25
 */
@RestController
@RequestMapping("test02")
public class Test02Controller {

    @RequestMapping("hello02")
    public String hello2(){
        return "hello02!!!!";
    }
}
