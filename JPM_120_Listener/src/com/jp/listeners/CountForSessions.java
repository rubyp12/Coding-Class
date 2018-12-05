package com.jp.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountForSessions
 *
 */
@WebListener
public class CountForSessions implements HttpSessionListener {

    public CountForSessions() {
    	System.out.println("Listener created");
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("Session created");
    	Cart cart = new Cart()
    	HttpSession session = arg0.getSession();
    	session.setAttribute("cart", cart);
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("Session destroyed");
    }
	
}
