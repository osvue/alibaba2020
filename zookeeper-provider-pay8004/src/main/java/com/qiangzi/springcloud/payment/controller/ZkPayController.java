package com.qiangzi.springcloud.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @program: alibaba2020
 * @description: zk
 * @author: Mr.Han
 * @create: 2020-03-15 09:13
 */
@RestController
public class ZkPayController {
  @Value("${server.port}")
  String port;

  @GetMapping(value = "/zk/pay/{ls}")
  public String testZk(@PathVariable(value = "ls") String str) {
    return "yourPort" + port + " \t and " + "\t" + str;
  }
}
