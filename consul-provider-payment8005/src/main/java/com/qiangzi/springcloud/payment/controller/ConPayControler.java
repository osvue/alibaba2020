package com.qiangzi.springcloud.payment.controller;

import com.qiangzi.springcloud.commons.domain.OauthClientDetails;
import com.qiangzi.springcloud.commons.utils.ResultBean;
import com.qiangzi.springcloud.payment.service.IOauthClientDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: alibaba2020
 * @description: consu
 * @author: Mr.Han
 * @create: 2020-03-15 10:38
 **/
@RestController
public class ConPayControler {

    @Resource
    IOauthClientDetailsService oauthClientDetailsService;

    @RequestMapping(value = "/gets",method = RequestMethod.GET)
    public ResultBean<List<OauthClientDetails>> consul(){
        return new ResultBean<>(oauthClientDetailsService.list());
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public ResultBean<OauthClientDetails> getbyid(@PathVariable(value = "id") String primary){
if(primary.equals("abc")){
    throw new RuntimeException("primaryKey");
}
        return new ResultBean<>( oauthClientDetailsService.getById(primary));
    }
}
 