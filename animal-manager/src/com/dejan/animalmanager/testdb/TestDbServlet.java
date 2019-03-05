package com.dejan.animalmanager.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "springuser";
		String pass = "springuser";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/animal_manager?useSSL=false";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: "+ jdbcUrl);
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
			out.println("Success");
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new ServletException(ex);
		}
	}

}
