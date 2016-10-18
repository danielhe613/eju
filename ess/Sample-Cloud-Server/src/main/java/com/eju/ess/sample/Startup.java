package com.eju.ess.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer // 启用eureka服务配置
@SpringBootApplication
public class Startup {
	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

}
