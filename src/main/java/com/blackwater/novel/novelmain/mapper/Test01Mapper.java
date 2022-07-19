package com.blackwater.novel.novelmain.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author by MechellWater
 * @date : 2022-07-18 14:03
 */
@Mapper
public interface Test01Mapper {
    String getTestString();

    String getTest01StringByAuthor(String author);

    List<String> getTest01StringListByAuthor(String author);
}
