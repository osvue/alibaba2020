package com.qiangzi.springcloud.payment.controller;

import com.qiangzi.springcloud.commons.domain.User;
import com.qiangzi.springcloud.commons.utils.ResultBean;
import com.qiangzi.springcloud.payment.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: alibaba2020
 * @description: controller
 * @author: Mr.Han
 * @create: 2020-03-14 10:57
 */
@RestController
public class PaymentController {

  @Resource IUserService userService;

  @GetMapping("/user")
  public ResultBean<List<User>> getUsers() {
    return new ResultBean<>(userService.list());
  }
}
