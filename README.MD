# 从分布式架构到领域驱动设计    
### SpringCloud微服务
    代码示例
    注册中心 eureka-sever
    网关     service-gateway
    （领域）服务模块
        service-provider
        service-provider2（service-provider实例2 负载均衡测试用）
        service-consumer（包含feign ribbon hystrix）

#### 微服务测试
    Controller
    org.pp.serviceconsumer.SubstitutionController
    
    敏捷式为service-consumer集成feign ribbon hystrix等功能

### 系统间通信 
    RPC与Restful
    RPC远程过程调用，屏蔽通信协议(tcp,udp,http)，提供接口api（方法签名） -- 需要注册服务与代理调用 客户端服务器模式
    Restful 一切都是资源（URI），使用http（超文本传输）作为传输协议
    
    系统间通信使用消息 还是 远程调用 

### 分布式架构
    安全性
    高性能
    高可用
    可伸缩
    可扩展

# 参考资料
- [1] 微服务分布式构架开发实战 
- [2] Spring Cloud微服务全栈技术与案例解析 
- [3] 可伸缩服务架构：框架与中间件
- [4] 分布式服务架构.原理、设计与实战
- [5] 微服务设计
- [6] 分布式JAVA应用+基础与实践
- [7] 大型网站技术架构：核心原理与案例分析 
- [8] 大规模分布式系统架构与设计实战
- [9] 大型分布式网站架构设计与实践 
   
    