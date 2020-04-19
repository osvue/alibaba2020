package com.qiangzi.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: alibaba2020
 * @description: zookeeper作为注册中心
 * @author: Mr.Han
 * @create: 2020-03-15 09:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZKPayApp {

  public static void main(String[] args) {
    SpringApplication.run(ZKPayApp.class, args);
  }
}
