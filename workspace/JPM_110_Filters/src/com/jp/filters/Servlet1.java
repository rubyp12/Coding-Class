package com.jp.filters;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(urlPatterns="/servlet1", loadOnStartup=1)
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In Servlet");
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MyJSP1.jsp");
		dispatch.include(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	@Override
	public void destroy() {
		System.out.println("In destroy of servlet1");
		super.destroy();
	}
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("In init of servlet1");
	}
}
