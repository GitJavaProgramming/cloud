package org.pp.consumer02.hystrix;

import feign.hystrix.FallbackFactory;
import org.pp.consumer02.ServiceProviderFeignClient;
import org.springframework.stereotype.Component;

@Component
public class DefaultFallback implements FallbackFactory<ServiceProviderFeignClient> {


    public ServiceProviderFeignClient create(Throwable cause) {
        return new ServiceProviderFeignClient() {
            @Override
            public String hello() {
                return "public class DefaultFallback implements FallbackFactory<ServiceProviderFeignClient>";
            }
        };
    }
}
