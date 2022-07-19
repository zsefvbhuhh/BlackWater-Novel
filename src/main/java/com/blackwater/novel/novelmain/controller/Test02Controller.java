package com.blackwater.novel.novelmain.controller;

import com.blackwater.novel.novelmain.service.SayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试Controller02
 * @author by MechellWater
 * @date : 2022-07-16 15:25
 */
@RestController
@RequestMapping("test02")
@Slf4j
public class Test02Controller {

    @Autowired
    private SayService sayService;

    @RequestMapping("hello02")
    public String hello2(){
        log.info("这是log4j测试!");
        return "hello02!!!!";
    }

    @RequestMapping("saying02")
    public List<String> getSayingStringList(@RequestParam(value = "author") String author){
        return sayService.getTest02StringListByAuthor(author);
    }
}
