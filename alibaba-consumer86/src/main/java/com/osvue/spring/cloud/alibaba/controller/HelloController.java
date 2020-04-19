package com.osvue.spring.cloud.alibaba.controller;

import com.osvue.spring.cloud.alibaba.feign.client.ProClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Mr.Han
 * @Description: alibaba2020
 * @Date: Created in 2020/4/19_10:31
 * @Modified By: THE GIFTED
 */
@RestController
public class HelloController {

  @Autowired
  ProClient proClient;

  @GetMapping(value = "public")
  public String sqy(){
    return proClient.say();
  }
}
 