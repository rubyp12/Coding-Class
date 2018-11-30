package com.jp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/** The below two approaches are adapted by JAVA API
 * Cookie: JSESSIONID.
 * URL rewriting:
 * Hidden Field:
 * 
 */
/**
 * Servlet implementation class Afterlogin
 */
@WebServlet("/Afterlogin")
public class Afterlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create a session
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		RequestDispatcher dispatch = request.getRequestDispatcher("WEB-INF/jsps/MainMenu.jsp");
		dispatch.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
