package com.yj.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yj.springbootdemo.dao")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		//启动springboot程序，启动spring容器，启动内置tomcat
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
