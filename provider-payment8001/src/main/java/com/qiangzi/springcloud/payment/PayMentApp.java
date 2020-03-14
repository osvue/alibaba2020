package com.qiangzi.springcloud.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: alibaba2020
 * @description: app
 * @author: Mr.Han
 * @create: 2020-03-14 10:53
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.qiangzi.springcloud.payment.mapper"})
public class PayMentApp {

    public static void main(String[] args) {
        SpringApplication.run(PayMentApp.class,args);
    }
}
