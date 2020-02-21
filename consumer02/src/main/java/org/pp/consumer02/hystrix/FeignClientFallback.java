package org.pp.consumer02.hystrix;

import org.pp.consumer02.ServiceProviderFeignClient;
import org.springframework.stereotype.Component;

@Component
public class FeignClientFallback implements ServiceProviderFeignClient {

    public String hello() {
        return "hello hystrix...";
    }
}
