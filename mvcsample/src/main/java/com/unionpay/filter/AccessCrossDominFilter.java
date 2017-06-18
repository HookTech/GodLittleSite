package com.unionpay.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class AccessCrossDominFilter implements Filter{

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		if(response instanceof HttpServletResponse){
			HttpServletResponse nRes = (HttpServletResponse) response;
			nRes.setHeader("Access-Control-Allow-Origin", "*");
			filterChain.doFilter(request, response);
		}
		else{
			throw new ServletException("系统异常!!!!!");
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
