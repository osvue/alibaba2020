package com.qiangzi.springcloud.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: alibaba2020
 * @description: 开启OpenFeign日志
 * @author: Mr.Han
 * @create: 2020-03-15 16:56
 */
@Configuration
public class FeignLogConfig {
  @Bean
  Logger.Level feignLoggerLevel() {
    return Logger.Level.FULL;
  }
}
