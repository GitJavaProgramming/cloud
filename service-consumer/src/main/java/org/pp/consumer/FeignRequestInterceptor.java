package org.pp.consumer;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class FeignRequestInterceptor implements RequestInterceptor {

    //    @Value("${auth}")
    @Override
    public void apply(RequestTemplate template) {
        template.header("auth", "auth");
    }
}
