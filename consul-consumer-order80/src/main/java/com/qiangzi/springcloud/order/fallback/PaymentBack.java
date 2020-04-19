package com.qiangzi.springcloud.order.fallback;

import com.qiangzi.springcloud.commons.domain.OauthClientDetails;
import com.qiangzi.springcloud.commons.utils.ResultBean;
import com.qiangzi.springcloud.order.api.PaymentFeign;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: alibaba2020
 * @description: Hystrix回调
 * @author: Mr.Han
 * @create: 2020-03-16 07:29
 */
@Component
public class PaymentBack implements PaymentFeign {

  @Override
  public ResultBean<List<OauthClientDetails>> consul() {
    return new ResultBean<>(ResultBean.UNKNOWN_EXCEPTION, null);
  }

  @Override
  public ResultBean<OauthClientDetails> getbyid(String primary) {
    return new ResultBean<>(ResultBean.UNKNOWN_EXCEPTION, "服务繁忙");
  }
}
