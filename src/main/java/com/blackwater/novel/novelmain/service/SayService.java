package com.blackwater.novel.novelmain.service;

import com.blackwater.novel.novelmain.entity.Saying;
import com.blackwater.novel.novelmain.mapper.MybatisPlusTest01Mapper;
import com.blackwater.novel.novelmain.mapper.Test01Mapper;
import com.blackwater.novel.novelmain.mapper.Test02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author by MechellWater
 * @date : 2022-07-18 14:34
 */
@Service
@Transactional(readOnly = true)
public class SayService{
    @Autowired
    private Test01Mapper test01Mapper;

    @Autowired
    private Test02Mapper test02Mapper;

    @Autowired
    private MybatisPlusTest01Mapper mapper;

    public List<String> getTest01StringListByAuthor(String author){
        return test01Mapper.getTest01StringListByAuthor(author);
    }

    public List<String> getTest02StringListByAuthor(String author){
        return test02Mapper.getTest02StringListByAuthor(author);
    }

    public List<Saying> getSayingList(){
        return mapper.selectList(null);
    }
}
