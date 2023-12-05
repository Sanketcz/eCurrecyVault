package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.*;
import com.demo.dao.EmployeeDao;

/**
 * Servlet implementation class RegisterEmp
 */
public class RegisterEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDao edao=new EmployeeDao();
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		int contact=Integer.parseInt(request.getParameter("contact")); 
		
		Employee e1=new Employee(id, contact, name, password);
			
		int i=edao.registerEmployee(e1);
		
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		
		if (i==1) {
			System.out.println("1 record added..........!");
			rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			out.println("<h5>Success</h5>");
		}
		else {
			System.out.println("Error occured..........!");
			rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			out.println("<h5>Error Occured</h5>");
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
