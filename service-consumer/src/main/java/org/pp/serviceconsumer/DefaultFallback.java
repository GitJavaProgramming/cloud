package org.pp.serviceconsumer;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DefaultFallback implements FallbackFactory<ServiceProviderFeignClient> {

    @Override
    public ServiceProviderFeignClient create(Throwable cause) {
        return () -> "容错数据";
    }
}
