package com.osvue.spring.cloud.alibaba;

     import org.springframework.boot.SpringApplication;
     import org.springframework.boot.autoconfigure.SpringBootApplication;
     import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
     import org.springframework.cloud.openfeign.EnableFeignClients;
     import org.springframework.context.annotation.Bean;
     import org.springframework.http.client.ClientHttpRequestFactory;
     import org.springframework.http.client.SimpleClientHttpRequestFactory;
     import org.springframework.web.client.RestTemplate;

/**
 * @Author: Mr.Han
 * @Description: alibaba2020
 * @Date: Created in 2020/4/19_10:29
 * @Modified By: THE GIFTED
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsuApp86 {

  public static void main(String[] args) {
    SpringApplication.run(ConsuApp86.class,args);
  }
}
