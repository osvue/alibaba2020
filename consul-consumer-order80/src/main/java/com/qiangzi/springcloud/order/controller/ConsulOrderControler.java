package com.qiangzi.springcloud.order.controller;

import com.qiangzi.springcloud.commons.utils.ResultBean;
import com.qiangzi.springcloud.order.api.PaymentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: alibaba2020
 * @description: consu
 * @author: Mr.Han
 * @create: 2020-03-15 10:38
 **/
@RestController
public class ConsulOrderControler {
    @Resource
    PaymentFeign paymentFeign;

    @RequestMapping(value = "/voids",method = RequestMethod.GET)
    public ResultBean<String> consul(){

        System.out.println( paymentFeign);

        return paymentFeign.consul();
    }
}
 