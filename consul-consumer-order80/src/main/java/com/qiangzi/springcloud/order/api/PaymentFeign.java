package com.qiangzi.springcloud.order.api;

import com.qiangzi.springcloud.commons.domain.OauthClientDetails;
import com.qiangzi.springcloud.commons.utils.ResultBean;
import com.qiangzi.springcloud.order.fallback.PaymentBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/** @author THE GIFTED */
@Component
@FeignClient(value = "consul-provider-payment", fallback = PaymentBack.class)
public interface PaymentFeign {

  @RequestMapping(value = "/gets", method = RequestMethod.GET)
  ResultBean<List<OauthClientDetails>> consul();

  @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
  ResultBean<OauthClientDetails> getbyid(@PathVariable(value = "id") String primary);
}
