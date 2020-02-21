package org.pp.consumer02.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class FeignRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        System.out.println("feign request interceptor...");
        template.header("auth", "auth");
    }
}
