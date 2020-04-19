package com.qiangzi.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: alibaba2020
 * @description: 网关服务
 * @author: Mr.Han
 * @create: 2020-03-16 11:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GateApp {

  public static void main(String[] args) {
    SpringApplication.run(GateApp.class, args);
  }
}
