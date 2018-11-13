基于Dubbo的微服务基础框架，为前端提供脚手架开发基础框架，项目代码：

>[https://github.com/backkoms/web-service-demo](https://github.com/backkoms/web-service-demo)
>[https://gitee.com/Kristening/web-service-demo](https://gitee.com/Kristening/web-service-demo)


![](src/site/arc2.png)

项目定位：
>用于从大单体应用中解耦，实施前后端分离部署、分层部署、分服务部署，可使用独立数据库，应用redis缓存，发送MQ消息

### 基础依赖
- JDK 8+
- Zookeeper
- Redis
- Rabbitmq

### 技术组件：
- Spring Boot 2.0.4.RELEASE
- Swagger 2.6.1
- Dubbo-spring-boot-starter 0.2.0
- Spring-boot-starter-data-redis
- Mybatis-spring-boot-starter
- Spring-boot-starter-amqp
- Lombok

### 提供功能：
- 基于profiles提供的多环境打包构建
- 集成Log4j日志服务
- 集成redis，提供缓存
- 集成mybatis
- 集成mybatis-generator，快速上手数据库业务开发
- 集成rabbitmq，将消息处理从业务应用中解耦
- 集成Docker构建插件，可打包成Docker镜像运行
- 集成lombok，简化实体的编写


>注：web-api-demo的Github项目地址：
https://github.com/backkoms/web-api-demo
https://gitee.com/Kristening/web-api-demo
基于SpringBoot2和Swagger的WEB API框架，面向移动端（手机App，公众号，小程序.....）提供的API服务脚手架开发框架。


# 联系我

![](src/site/qrcode_for_gh_28fb95c9c24c_258.jpg)

微信号：Dqango
