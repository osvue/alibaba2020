package com.osvue.spring.cloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.qiangzi.springcloud.commons.utils.ResultBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mr.Han @Description: alibaba2020 @Date: Created in 2020/5/11_17:39 @Modified By: THE
 * GIFTED
 */
@RestController
public class TsResourceController {

  @GetMapping(value = "/gtrss")
  @SentinelResource(value = "gtr", blockHandler = "errorHandle")
  public ResultBean<String> tsRes() {
    return new ResultBean<>("测试全局的ResultController");
  }

  public ResultBean<String> errorHandle(BlockException gl) {
    return new ResultBean<>(888, "测试全局的ResultController" + gl.getMessage());
  }

  @GetMapping("/byResource")
  @SentinelResource(value = "byResource", blockHandler = "handleException")
  public ResultBean<String> byResource() {
    return new ResultBean<>(200, "按资源名称限流测试OK");
  }

  public ResultBean<String> handleException(BlockException exception) {
    return new ResultBean<>(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
  }
}
