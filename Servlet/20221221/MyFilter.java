package org.bigdata;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter 필터요청 코드작업!!");
		req.setCharacterEncoding("UTF-8");
		chain.doFilter(req, resp);
		System.out.println("MyFilter 응답필터 코드작업!!");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("MyFilter 제거!!");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter 초기화!!");
	}

	
}
