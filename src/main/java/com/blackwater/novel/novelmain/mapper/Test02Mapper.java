package com.blackwater.novel.novelmain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author by MechellWater
 * @date : 2022-07-18 14:16
 */
@Mapper
public interface Test02Mapper{
    @Select("select * from saying limit 1")
    String getTest02String();

    @Select("select * from saying where author = #{author} limit 1")
    String getTest02StringByAuthor(String author);

    @Select("select body from saying where author = #{author} limit 2")
    List<String>  getTest02StringListByAuthor(String author);
}
