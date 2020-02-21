package org.pp.consumer02;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallback implements ServiceProviderFeignClient {

    public String hello() {
        return "hello hystrix...";
    }
}
