package com.blackwater.novel.novelmain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Controller01
 * @author by MechellWater
 * @date : 2022-07-16 15:02
 */
@Controller
@RequestMapping("test01")
public class Test01Controller {

    @RequestMapping("hello01")
    @ResponseBody
    public String hello(){
        return "Hi,MyBro";
    }

}
