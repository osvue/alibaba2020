package com.qiangzi.springcloud.order.controller;

import com.qiangzi.springcloud.commons.utils.ResultBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: alibaba2020
 * @description: consu
 * @author: Mr.Han
 * @create: 2020-03-15 10:38
 **/
@RestController
public class ConsulOrderControler {

    @RequestMapping(value = "/consul/tes",method = RequestMethod.GET)
    public ResultBean<String> consul(){
        return new ResultBean<>("hello World This is consol control");
    }
}
 