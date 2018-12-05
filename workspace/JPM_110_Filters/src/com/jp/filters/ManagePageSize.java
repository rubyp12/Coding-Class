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

/**
 * Servlet Filter implementation class ManagePageSize
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "*.do" })
public class ManagePageSize implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// Before part
				System.out.println("In Before part of filter-MP");
				RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Header.jsp");
				dispatch.include(request, response);
				chain.doFilter(request, response);
				System.out.println("In after part of filter-MP");
				dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Footer.jsp");
				dispatch.include(request, response);
				// After part
			}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	public void destroy() {


