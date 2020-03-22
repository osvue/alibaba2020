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


| service    | mq           | 
| :------:   | :------:    | 
|            |              |
|            |              |
|            |             | 
|            |            |  
|            |            |  


* 2020/03/22
    - 升级MySQL 8.0.19 
    - 开发configBus
* 添加Sleuth 链路追踪
    - 在 Spring Boot 2.0 版本之后，官方已不推荐自己搭建定制了，而是直接提供了编译好的 jar 包。
    - 详情可以查看官网：https://zipkin.io/pages/quickstart.html


# 番外篇
**因为前期开发忘记了添加 `.gitignore` 文件 导致了 `target` 目录提交了上去,抱歉**