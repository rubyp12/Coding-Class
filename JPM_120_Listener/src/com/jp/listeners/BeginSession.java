package com.jp.listeners;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BeginSession
 */
@WebServlet("/BeginSession")
public class BeginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		/*
		 * getSession() : If session exists: Bring the reference of session.
		 * getSession(t)Otherwise create a new session.
		 * 
		 * getSession(false) : If session exists: 
		 */
	}
RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/myjsp.jsp");
DispatcherType forward(request,response);
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
