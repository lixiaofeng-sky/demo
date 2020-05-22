package com.lxf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("启动spring boot");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("启动DemoApplication完成....");
    }

}
