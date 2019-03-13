# letao_mall
使用dubbo+springboot改造的乐淘商城（原淘淘商城）
乐淘项目类似于JD的全品类B2C电商项目,选择该项目的主要原因是电商项目具有高并发,数据量大,技术新,技术范围广等特点,
此项目,基于SOA的架构来实现。采用dubbo+zookeeper实现表现层和服务层之间的RPC通信,数据库使用的是Mysql。
使用了SpringBoot快速开发项目,使用了rabbitmq消息中间件进行异步通信和解耦等,项目分为前台后台，前台门户系统提供活动商品展示，
商品分类,商品搜索，购物车，订单，支付，个人中心等模块，后台管理系统提供管理的商品,内容管理，订单管理等模块
前端技术：

- **基础的HTML、CSS、JavaScript（基于ES6标准**）
- **JQuery**
后端技术：

- 基础的SpringMVC、Spring 5.0和MyBatis3
- Spring Boot 2.0.1版本
- dubbo
- zookeeper
- Redis-4.0
- RabbitMQ-3.4
- slor
- nginx-1.10.2：
- FastDFS - 5.0.8
- MyCat
- Thymeleaf
- JavaMail
