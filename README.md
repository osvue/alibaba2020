#  alibaba For 2020
**Note: In addition to the Alibaba components, this project is mostly built on the consul registry**

**Version reference address :** https://start.spring.io/actuator/info
### Hoxton.SR3": "Spring Boot >=2.2.0.M4 and <2.2.6.BUILD-SNAPSHOT 

**个人邮箱: hzqq110@163.com** 

| service    | 注册发现     | 负载调用     |  服务熔断降级  | 服务网关     | 配置中心     |  服务熔断降级        |
| :------:   | :------:    | :------:    | :------:    | :------:    | :------:    | :------:           |
|            | eureka      | OpenFeign    |  Hystrix    | gateway      |  Config    |  Hystrix           |
|            | zookeeper   |  Feign      |   Sentinel  |  Zuul        |  Nacos      |                    |
|            |  Consul     | Ribbon      |             |             |   Apollo     |                    |
|            |  Nacos   |             |              |            |             |                    |
|            |            |             |              |            |             |                    | 


| service    | mq         |             | 
| :------:   | :------:   | :------:    | 
|            | RabbitMq  |              |
|            |RocketMq   |             |
|            |ActiveMq   |             | 
|            |ZeroMq     |            |  
|            | KafKa     |            |  

* 2020/02/15
    - 初始化项目,第三个长期维护项目

* 2020/03/22
    - 升级MySQL 8.0.19 
    - 开发configBus
* 添加Sleuth 链路追踪
    - 在 Spring Boot 2.0 版本之后，官方已不推荐自己搭建定制了，而是直接提供了编译好的 jar 包。
    - 详情可以查看官网：https://zipkin.io/pages/quickstart.html

* 2020/04/19
    - 前段时间一直在忙着整自己的博客(原先的Hexo替换为了[VuePress](https://osvue.github.io))导致暂停更新的一段时间
    - 从今天开始陆续更新Spring Cloud Alibaba

* 2020/04/23
    - add Alibaba Nacos Config and server point
   
* 2020/05/20
    - 愿天下有情人都成了眷属，是前生注定事莫错过姻缘
    - 因为疫情的原因以及up主本人工作调整, 最近在做WebLogic相关,故更新较少,请持续关注[Blog](https://osvue.github.io)

* 2020/09/27
    - 到首都了一段时间，最近在忙的是 **Linux** 相关，故而又推迟了更新，下一步准备加入 **Docker** 镜像
    - **DockerFile--docker-compose** --》 kubernates --> jekenis
    - Quartz Project [boot-quartz-antd_vue](https://github.com/osvue/springboot_quartz_vue.git) 敬请期待。。


        
## 框架集成

集成 | 完成 
----|----
Spring Boot | ✔
Spring Cloud Alibaba | ✔ 
Spring Cloud Alibaba Nacos | ✔ 
Spring Cloud Alibaba Sentinel | ✔ 
Spring Security oAuth2 | ✔ 
MyBatis Plus | ✔ 
HikariCP | ✔ 
OKHttp3 | ✔ 
Feign 传递 Token | X 
# 番外篇
**因为前期开发忘记了添加 `.gitignore` 文件 导致了 `target` 目录提交了上去,抱歉**


---
quick start 
- A consul 注册中心 9500
- B zipkin 链路追踪 9411
- C configServer 配置中心 9999
- D consul provider and consumer