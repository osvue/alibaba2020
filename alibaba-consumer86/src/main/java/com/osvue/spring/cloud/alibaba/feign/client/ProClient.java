package com.osvue.spring.cloud.alibaba.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Mr.Han
 * @Description: alibaba2020
 * @Date: Created in 2020/4/19_10:43
 * @Modified By: THE GIFTED
 */
@Component
@FeignClient(value = "alibaba-provider")
public interface ProClient {
  @GetMapping("/osvue")
  public String say();
}
