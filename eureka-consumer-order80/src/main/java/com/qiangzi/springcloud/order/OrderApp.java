package com.qiangzi.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: alibaba2020
 * @description: 订单
 * @author: Mr.Han
 * @create: 2020-03-14 19:28
 **/
@EnableEurekaClient
@SpringBootApplication
public class OrderApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class,args);
    }
}
 