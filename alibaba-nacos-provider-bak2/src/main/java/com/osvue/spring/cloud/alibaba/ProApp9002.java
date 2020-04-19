package com.osvue.spring.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Mr.Han
 * @Description: alibaba2020
 * @Date: Created in 2020/4/19_10:01
 * @Modified By: THE GIFTED
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ProApp9002 {

  public static void main(String[] args) {
    SpringApplication.run(ProApp9002.class,args);
  }
}
 