package com.qiangzi.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.security.auth.login.Configuration;

/**
 * @program: alibaba2020
 * @description: consul服务提供者
 * @author: Mr.Han
 * @create: 2020-03-15 10:36
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulPayApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsulPayApp.class,args);
    }
}
 