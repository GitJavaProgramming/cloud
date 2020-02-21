package org.pp.consumer02;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-provider", fallback = FeignClientFallback.class/*, fallbackFactory = DefaultFallback.class*/)
public interface ServiceProviderFeignClient {

    @GetMapping("/house/hello")
    String hello();

}
