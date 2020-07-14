package com.javaminds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FetchDate")
public class FetchDate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int d=Integer.parseInt(request.getParameter("dd"));
		int m=Integer.parseInt(request.getParameter("mm"));
		int y=Integer.parseInt(request.getParameter("yyyy"));
		
		String result=DayOfTheDate.dayOfTheDate(d, m, y);
		request.setAttribute("result", result);
		request.setAttribute("d", d); 
		request.setAttribute("m", m);
		request.setAttribute("y", y);
		 
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
