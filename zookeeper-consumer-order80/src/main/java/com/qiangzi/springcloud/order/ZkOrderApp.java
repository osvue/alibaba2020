package com.qiangzi.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: alibaba2020
 * @description: zookeeper服务消费者
 * @author: Mr.Han
 * @create: 2020-03-15 09:30
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZkOrderApp {
  public static void main(String[] args) {

    SpringApplication.run(ZkOrderApp.class, args);
  }
}
