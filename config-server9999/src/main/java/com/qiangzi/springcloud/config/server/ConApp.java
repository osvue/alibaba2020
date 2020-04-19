package com.qiangzi.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: alibaba2020
 * @description: config配置中心
 * @author: Mr.Han
 * @create: 2020-03-22 10:21
 */
@SpringBootApplication
@EnableConfigServer
public class ConApp {
  public static void main(String[] args) {
    SpringApplication.run(ConApp.class, args);
  }
}
