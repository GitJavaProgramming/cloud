package org.pp.servicegateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求过滤器
 */
public class RequestFilter extends ZuulFilter {

    /**
     * 标识该过滤器过滤的时机
     * pre：可以在请求被路由之前调用
     * route：在路由请求时候被调用
     * post：在route和error过滤器之后被调用
     * error：处理请求时发生错误时被调用
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE; //更改试试
    }

    @Override
    public int filterOrder() {
        return 110; //过滤器执行顺序
    }

    @Override
    public boolean shouldFilter() {
        return true; // 是否开启过滤器
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rcx = RequestContext.getCurrentContext();
        rcx.addZuulRequestHeader("auth", "token");
//        HttpServletRequest request = rcx.getRequest();
//        System.out.println(String.format("%s AccessPasswordFilter request to %s", request.getMethod(), request.getRequestURL().toString()));
//        String username = request.getParameter("username");
//        String token = getToken(username); // get token
//        if(token == null || !token.equals("pp")) {
//            rcx.setResponseBody("token error");
//            rcx.setSendZuulResponse(false);
//        } else {
//            rcx.setSendZuulResponse(true);
//            rcx.setResponseBody("过滤了");
////            rcx.addZuulRequestHeader("auth", token);
//        }
        return null;
    }

    private String getToken(String username) {
        String token = username; // get token
        return token;
    }
}
