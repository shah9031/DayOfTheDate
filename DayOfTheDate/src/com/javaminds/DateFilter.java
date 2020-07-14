package com.javaminds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class DateFilter
 */
@WebFilter("/FetchDate")
public class DateFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public DateFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int d = Integer.parseInt(req.getParameter("dd"));
		int m = Integer.parseInt(req.getParameter("mm"));
		int y = Integer.parseInt(req.getParameter("yyyy"));
		RequestDispatcher rd;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (d >= 1 && d <= 31) {
					chain.doFilter(request, response);
				}else {
					rd=request.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
					
			} else if (m == 2) {
				if (d >= 1 && d <= 29)
					chain.doFilter(request, response);
				else {
					rd=request.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
			} else if(m==4||m==6||m==9||m==11) {
				if (d >= 1 && d <= 30)
					chain.doFilter(request, response);
				else {
					rd=request.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
			}
			else {
				rd=request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
		} else{
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (d >= 1 && d <= 31)
					chain.doFilter(request, response);
				else {
					rd=request.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
			} else if (m == 2) {
				if (d >= 1 && d <= 28)
					chain.doFilter(request, response);
				else {
					rd=request.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
			} else if(m==4||m==6||m==9||m==11) {
				if (d >= 1 && d <= 30)
					chain.doFilter(request, response);
				else {
					rd=request.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
			}
			else {
				rd=request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
		}
	}

	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
