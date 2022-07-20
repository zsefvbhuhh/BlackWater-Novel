package com.blackwater.novel;

import com.blackwater.novel.novelmain.mapper.Test01Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NovelApplicationTests {
	@Autowired
	Test01Mapper test01Mapper;

	@Test
	void testMapperLog(){
		String result = test01Mapper.getTest01StringByAuthor("water");
		System.out.println("result = " + result);
	}

	@Test
	void contextLoads() {
	}

}
