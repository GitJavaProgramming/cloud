package org.pp.serviceconsumer;

import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/substitution")
public class SubstitutionController {

    private static final Logger logger = LoggerFactory.getLogger(SubstitutionController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private ServiceProviderFeignClient serviceProviderFeignClient; // idea下编译报错

    @GetMapping("/callHello")
    public String callHello() {
        // localhost不能使用
        return restTemplate.getForObject("http://service-provider:8081/house/hello", String.class);
    }

    @GetMapping("/show-provider")
    public List<ServiceInstance> showInfo() {
        return discoveryClient.getInstances("service-provider");
    }

    @GetMapping("/log-instance")
    public void logInstance() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-provider");
        logger.info("ServiceId({}):{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }

    @GetMapping("/callHello2")
    public String callHello2() {
        return serviceProviderFeignClient.hello();
    }
}
