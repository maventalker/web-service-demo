package com.growithus.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 后台服务端
 * 
 * @author guooo 2018年10月25日 下午2:18:27
 * 
 */
@SpringBootApplication
@EnableDubbo
public class BizServiceApplicationStartup {

	public static void main(String[] args) {
		SpringApplication.run(BizServiceApplicationStartup.class, args);
	}

}
