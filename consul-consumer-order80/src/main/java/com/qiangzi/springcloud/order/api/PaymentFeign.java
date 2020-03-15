package com.qiangzi.springcloud.order.api;

import com.qiangzi.springcloud.commons.utils.ResultBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author THE GIFTED
 */
@Component
@FeignClient(value = "consul-provider-payment")
public interface PaymentFeign {

    @RequestMapping(value = "/consul/tes",method = RequestMethod.GET)
    ResultBean<String> consul();
}
