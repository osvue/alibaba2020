package com.qiangzi.springcloud;

import cn.hutool.json.JSONUtil;
import com.qiangzi.springcloud.commons.domain.User;
import com.qiangzi.springcloud.commons.utils.JsonUtil;
import com.qiangzi.springcloud.commons.utils.ResultCode;

/**
 * @program: alibaba2020
 * @description: ceshi
 * @author: Mr.Han
 * @create: 2020-03-16 07:50
 */
public class TS {
  public static void main(String[] args) {
    System.out.println(JsonUtil.objectToJson(new User()));
  }
}
