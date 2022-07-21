package com.blackwater.novel.novelmain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blackwater.novel.novelmain.entity.Saying;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author by MchellWater
 * @date : 2022-07-20 20:34
 */
@Mapper
public interface MybatisPlusTest01Mapper extends BaseMapper<Saying> {
    List<Saying>  getSayingListByAuthor(@Param("author") String author);
}
