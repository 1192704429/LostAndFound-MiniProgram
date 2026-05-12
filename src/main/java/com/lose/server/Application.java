package com.lose.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
/**
* @description: 主启动类
* @author: wuming
* @create: 2023.04.06 11:23:59
*/
@MapperScan("com.lose.server.dao")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
