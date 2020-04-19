package com.qiangzi.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: alibaba2020
 * @description: 服务注册中心
 * @author: Mr.Han
 * @create: 2020-03-14 19:04
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApp.class, args);
  }
}
