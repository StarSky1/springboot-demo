package com.yj.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.yj.springbootdemo.dao") //指定mapper文件的扫描地址
@EnableTransactionManagement	//开启spring的事务支持
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		//启动springboot程序，启动spring容器，启动内置tomcat
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
