package org.pp.serviceconsumer;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallback implements ServiceProviderFeignClient {

    @Override
    public String hello() {
        return "你好，断路了。";
    }
}
