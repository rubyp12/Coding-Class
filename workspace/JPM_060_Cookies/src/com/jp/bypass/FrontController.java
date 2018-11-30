package com.jp.bypass;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
// URL when servlet is started http://localhost:8080/ProjectName/*.do?page=Welcome
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		RequestDispatcher dispatch =  null;
		switch(page){
		case "Welcome" :{
			Cookie[] cookies =  request.getCookies();
			dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Welcome.jsp");
			
			for(Cookie cookie : cookies){
				if (cookie.getName().equals("bypassPage")){
					dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");	
					break;
				}
			}
			dispatch.forward(request, response);		
			break;
		}
		case "Menu" :{
			String isBoxChecked = request.getParameter("ToBypaas");
			System.out.println(isBoxChecked);
			if (isBoxChecked!=null){
				//Creating a cookie
				Cookie c = new Cookie("bypassPage", "");
				c.setMaxAge(60*60*48);
				response.addCookie(c);
			}
			dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");
			dispatch.forward(request, response);
			break;
		}
	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
