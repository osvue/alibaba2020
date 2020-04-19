package com.qiangzi.springcloud.payment;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import javax.security.auth.login.Configuration;

/**
 * @program: alibaba2020
 * @description: consul服务提供者
 * @author: Mr.Han
 * @create: 2020-03-15 10:36
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
@MapperScan(basePackages = {"com.qiangzi.springcloud.payment.mapper"})
public class ConsulPayApp {

  public static void main(String[] args) {
    SpringApplication.run(ConsulPayApp.class, args);
  }
  /**
   * 此配置是为了服务监控而配置，与服务容错本身无关，springcloud升级后的坑
   * ServletRegistrationBean因为springboot的默认路径不是"/hystrix.stream"， 只要在自己的项目里配置上下面的servlet就可以了
   */
  @Bean
  public ServletRegistrationBean getServlet() {
    HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
    ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
    registrationBean.setLoadOnStartup(1);
    registrationBean.addUrlMappings("/hystrix.stream");
    registrationBean.setName("HystrixMetricsStreamServlet");
    return registrationBean;
  }
}
