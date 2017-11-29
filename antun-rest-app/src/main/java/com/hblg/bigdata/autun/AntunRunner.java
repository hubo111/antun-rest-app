package com.hblg.bigdata.autun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * spring boot����
 * @author zdjy
 *
 */
@EnableScheduling
@SpringBootApplication
@MapperScan("com.hblg.bigdata.autun.mapper")
public class AntunRunner {
	public static void main(String[] args) {
		SpringApplication.run(AntunRunner.class, args);
	}
}
