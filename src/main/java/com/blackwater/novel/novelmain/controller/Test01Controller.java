package com.blackwater.novel.novelmain.controller;

import com.blackwater.novel.novelmain.mapper.Test01Mapper;
import com.blackwater.novel.novelmain.service.SayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 测试Controller01
 * @author by MechellWater
 * @date : 2022-07-16 15:02
 */
@Controller
@RequestMapping("test01")
@Slf4j
public class Test01Controller {
    @Autowired
    private SayService sayService;

    @Autowired
    Test01Mapper test01Mapper;

    @RequestMapping("hello01")
    @ResponseBody
    public String hello(){
        return "Hi,MyBro";
    }

    @RequestMapping("saying01")
    @ResponseBody
    public List<String> getSayingStringList(@RequestParam(value = "author") String author){
        return sayService.getTest01StringListByAuthor(author);
    }

    @ResponseBody
    @RequestMapping("hello02")
    public String getTest03(){
        return test01Mapper.getTestString();
    }
}
