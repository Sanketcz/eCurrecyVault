package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.EmployeeDao;

/**
 * Servlet implementation class WithdrawMoney
 */
public class WithdrawMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawMoney() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=============Inside withdraw money==========");
		EmployeeDao edao=new EmployeeDao();
		int wbal=Integer.parseInt(request.getParameter("wbal"));
		/*added cookies*/
		Cookie ca[]=request.getCookies();
		String name=ca[1].getValue();
		String password=ca[2].getValue();
		/**/
		System.out.println("--------------\nname--"+name+"\n pass-"+password);
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		
		int bal=edao.getBal(name, password);
		request.setAttribute("balance", bal);
		if (bal>=0) {
			
			int ubal=bal-wbal;
			edao.depositMoney(ubal,name,password);
			rd=request.getRequestDispatcher("Action");
			rd.include(request, response); 
			
			
		}
		else {
			System.out.println("Error occured..........!");
			rd=request.getRequestDispatcher("Action");
			rd.include(request, response); 
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
