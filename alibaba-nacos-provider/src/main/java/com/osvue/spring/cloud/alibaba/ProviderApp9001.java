package com.osvue.spring.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Mr.Han
 * @Description: alibaba2020
 * @Date: Created in 2020/4/19_9:44
 * @Modified By: THE GIFTED
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApp9001 {

  public static void main(String[] args) {
    SpringApplication.run(ProviderApp9001.class,args);
  }
}
 