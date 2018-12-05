package com.jp.filters;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
, servletNames = { "Servlet1" }, urlPatterns={"*.do"})
public class ModifyResponse implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// Before part
		System.out.println("In Before part of filter-MR");
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Header.jsp");
		dispatch.include(request, response);
		chain.doFilter(request, response);
		System.out.println("In after part of filter-MR");
		dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Footer.jsp");
		dispatch.include(request, response);
		// After part
	}

	public void init(FilterConfig fConfig) throws ServletException {
// Life cycle method for filter to do initialization
		System.out.println("In filter's init() MR ");
	}
	public void destroy() {
		System.out.println("In destroy() MR");
		
	}

}
