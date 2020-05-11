package com.osvue.spring.cloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Han
 * @Description: alibaba2020
 * @Date: Created in 2020/4/19_9:50
 * @Modified By: THE GIFTED
 */
@RestController
@RefreshScope     //配置动态刷新
public class HelloController {


  @Value("${config.info}")
  String info;

  @GetMapping("/osvue")
  public String say(){
    return "hello osvue"+info;
  }
}
 