package com.blackwater.novel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication : 标注这个类是SpringBoot应用
@SpringBootApplication
@MapperScan("com.blackwater.novel.**/.mapper")
public class NovelApplication {

	public static void main(String[] args) {
		//将SpringBoot应用启动
		SpringApplication.run(NovelApplication.class, args);
	}

}
