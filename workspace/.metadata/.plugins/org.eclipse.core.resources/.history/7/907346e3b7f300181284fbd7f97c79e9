package com.jp.hr.servlets;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")		// Generic url [.do is the filteration]
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceEmployee services; // Create a reference of Interface

	/*
	 	* Front Controller : A JEE design pattern.
		* Command pattern (GoF pattern).
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = getCommand(request.getRequestURI());
		RequestDispatcher dispatch = null;
		String jspName = null;
		String preFix = "/WEB-INF/jsps/";
		String postFix =".jsp";
		try {
			switch(command) {		
				
				case "*" : 
				
				case "mainMenu" :{
					jspName="MainMenu";
					break;
				}
				case "empList" :{
					ArrayList<Employee> empList = services.getEmpList();
					System.out.println(empList);			
					request.setAttribute("empList", empList);
					jspName= "EmpList";					
					break;
				}
				
				case "empDetails" : {
					String idStr = request.getParameter("id"); // empDetails.do?id=x this kind of url added in the anchor tag
					int empId = Integer.parseInt(idStr); // This empId i have to send to service layer
					Employee emp = services.getEmpDetails(empId);
					request.setAttribute("empDetails", emp);
					jspName= "EmpDetails";					
					break;
				}
				
				case "newJoining" : {				
					jspName= "NewJoining";					
					break;
				}
				case "submitJoinee" : {
					String empIdStr= request.getParameter("empId");
					String firstName= request.getParameter("firstName");
					String lastName= request.getParameter("lastName");
					int empId = Integer.parseInt(empIdStr);
					Employee emp = new Employee(empId,firstName,lastName);
					boolean isSucessfull = services.joinNewEmployee(emp);
					String msg = isSucessfull?"Employee Inserted.":"Insertion failed!";
					request.setAttribute("message", msg);
					jspName= "NewJoining";
					break;
				}
			}
		} catch (HrException e) {			
			e.printStackTrace();
		}
		 	
		dispatch = request.getRequestDispatcher(preFix + jspName + postFix);
		dispatch.forward(request, response);
		
	}	


		
		@Override
	public void init() throws ServletException {
		services = new ServiceEmployeeImpl();  // Create a object of Interface of ServiceEmployee Implementation
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
		
		
	private String getCommand(String uri) {
		
		
		int leftPos =uri.lastIndexOf("/");
		int rtPos = uri.lastIndexOf(".");
		if (rtPos<=leftPos) {
			return "mainMenu";
		}
		return uri.substring(leftPos+1, rtPos);		
	}
}
