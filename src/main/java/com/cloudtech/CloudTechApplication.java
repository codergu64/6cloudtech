package com.cloudtech;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
@MapperScan("com.cloudtech.mapper")
public class CloudTechApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudTechApplication.class,args);
    }
}
