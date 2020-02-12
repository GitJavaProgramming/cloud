package org.pp.servicegateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

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
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0; //过滤器执行顺序
    }

    @Override
    public boolean shouldFilter() {
        return true; // 是否开启过滤器
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        System.out.println(String.format("%s AccessPasswordFilter request to %s", request.getMethod(), request.getRequestURL().toString()));
        String token = request.getParameter("token");
        if(token == null || !token.equals("1")) {
            requestContext.setResponseBody("token error");
            requestContext.setSendZuulResponse(false);
        }
        return null;
    }
}
