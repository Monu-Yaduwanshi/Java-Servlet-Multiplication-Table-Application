package com.service10;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TablePrint extends HttpServlet {
	public void doPost( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
		 int a =Integer.parseInt(req.getParameter("t1"));
		
		 int i;
		 
	         PrintWriter out=res.getWriter();		
			out.print("<html><body><b>");
			out.print("Table of Number "+a+ " is as follows:<br>");
			for( i=1;i<=10;i++) {
				 int result=a*i;
				 out.print(a+"*"+i+"="+result+"<br>");
			 }
			out.print("</b></body></html>");
	 }
}