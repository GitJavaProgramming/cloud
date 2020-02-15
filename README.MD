# 从分布式架构到领域驱动设计    
    [1]、[2]等表示参考资料序号
### SpringCloud微服务
    注册中心 eureka-sever
    网关     service-gateway
    微服务
        service-provider
        service-provider2（service-provider实例2 负载均衡测试用）
        service-consumer（包含feign ribbon hystrix）

### 微服务测试
    Controller
    org.pp.serviceconsumer.SubstitutionController
    
    敏捷式为service-consumer集成feign ribbon hystrix等功能

### 分布式架构
    安全认证与授权 [1][2]
    微服务（分布式协调、领域驱动、模块化） [1][4][9]
    分布式缓存  [4]
    分布式事务 （SQL/NoSql数据库存储、消息队列）
    数据存储--分库分表（垂直/水平拆分）
    项目管理 (配置中心，文档api，定时任务，日志......)
    其他应用--搜索 
    分布式架构设计原则[5][6][7]

### 第一步 系统间通信 
    RPC与Restful
    RPC远程过程调用，屏蔽通信协议(tcp,udp,http)，提供接口api（方法签名） -- 需要注册服务与代理调用 客户端服务器模式
    Restful 一切都是资源（URI），使用http（超文本传输）作为传输协议
    
    参考：[7]  1.系统间通信使用消息 还是 远程调用  2.如何保证系统高可用  3.可伸缩系统

# 参考资料
- [1] 微服务分布式构架开发实战 
- [2] Spring Cloud微服务全栈技术与案例解析 
- [3] 可伸缩服务架构：框架与中间件
- [4] 大规模分布式系统架构与设计实战
- [5] 大型分布式网站架构设计与实践 
- [6] 大型网站技术架构：核心原理与案例分析 
- [7] 分布式JAVA应用+基础与实践
- [8] 分布式服务架构.原理、设计与实战
- [9] 微服务设计
   
    