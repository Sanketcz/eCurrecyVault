package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.LoginBean;
import com.demo.dao.EmployeeDao;

/**
 * Servlet implementation class LoginEmp
 */
public class LoginEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDao edao=new EmployeeDao();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		
		
		LoginBean lb= new LoginBean();
		request.setAttribute("name", name);
		request.setAttribute("password", password);
		lb.setName(name);
		lb.setPassword(password);
		int count=edao.loginEmployee(name,password);
		int bal=edao.getBal(name, password);
		System.out.println("bal---"+bal);
		request.setAttribute("balance", bal);
		System.out.println("count----"+count);
		
		/*coockies*/
		Cookie c1=new Cookie("name", name);
		Cookie c2=new Cookie("password", password);
		response.addCookie(c1);
		response.addCookie(c2);
		/**/
		if (count==1) {
			
			rd=request.getRequestDispatcher("mainmenu.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("Error occured..........!");
			out.print("<h1>Login Terminated</h1>");
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
