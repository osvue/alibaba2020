package com.qiangzi.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.security.auth.login.Configuration;

/**
 * @program: alibaba2020
 * @description: consul服务提供者
 * @author: Mr.Han
 * @create: 2020-03-15 10:36
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ConsulOrderApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderApp.class,args);
    }

}
 