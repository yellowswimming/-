package com.example.subgateway.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.client.RestTemplate;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/query/*")
@Order(1)
public class GateFilter implements Filter {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        String serviceName = String.valueOf(request.getRequestURI()).substring(7, String.valueOf(request.getRequestURI()).lastIndexOf('/'));
        String url="http://localhost:8080/check/request/"+serviceName;
        Boolean bool = restTemplate.getForObject(url, boolean.class);
        if(bool!=null&& !bool){
            return;
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
