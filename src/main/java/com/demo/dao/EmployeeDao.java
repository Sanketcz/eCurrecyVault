package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.demo.bean.Employee;
import com.demo.bean.LoginBean;
import com.demo.database.DBUtil;

public class EmployeeDao {
	
	private int count;
	Connection conn=null;

	public int registerEmployee(Employee em)
	{
		PreparedStatement ps;
		try {
			conn=DBUtil.getConn();
			String query="insert into userdb21 values(?,?,?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setInt(1, em.getId());
			ps.setString(2, em.getName());
			ps.setString(3, em.getPassword());
			ps.setInt(4, em.getContact());
			ps.setInt(5,0);
			
			count=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public int loginEmployee( String name,String password) {
		Statement ps;
		try {
			conn=DBUtil.getConn();
			ps=conn.createStatement();
			ResultSet rs=ps.executeQuery("select * from userdb21");
			System.out.println("we are in loginEmployee ------");
			while (rs.next()) {
				
				if(name.equals(rs.getString(2)) && password.equals(rs.getString(3))) {
					count=1;
					break;
				}
				else {
					count=0;
				}
			}	
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return count;	
		
		
	}
	
	public int getBal( String name, String password) {
		Statement ps;
		try {
			conn=DBUtil.getConn();
			ps=conn.createStatement();
			ResultSet rs=ps.executeQuery("select * from userdb21");
			while (rs.next()) {
				
				if(name.equals(rs.getString(2)) && password.equals(rs.getString(3))) {
					count=rs.getInt(5);
					System.out.println(rs.getInt(5)+"get bal---"+count);
					break;
				}
				else {
					count=0;
				}
			}	
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return count;
	}

	public int depositMoney(int ubal, String name, String password) {
		
		PreparedStatement ps;
		try {
			conn=DBUtil.getConn();
			System.out.println("deposited called");
			System.out.println("--------"+name);
			System.out.println(password+"--"+ubal);
			
			ps=conn.prepareStatement("update userdb21 set balance=? where name=? and password=?");
			System.out.println("-+=+-");
			ps.setInt(1, ubal);
			ps.setString(2, name);
			ps.setString(3, password);
			count=ps.executeUpdate();
			System.out.println("-----done update");
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return count;	
		
		// TODO Auto-generated method stub
		
	}
	
}
