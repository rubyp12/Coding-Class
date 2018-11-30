package com.jp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookies
 */
@WebServlet("/CreateCookies")
public class CreateCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie1 = new Cookie("c1","Itsasessioncookie");
		Cookie cookie2 = new Cookie("c2", "Itsapersistentcookie");
		
		cookie2.setMaxAge(120); //In Seconds
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.sendRedirect("showCookies"); // Redirect to another servlet for this need to create new servlet

	}

}
