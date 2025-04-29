package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int count=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs  = request.getSession();
		PrintWriter pw = response.getWriter();
		pw.println("Session is "+hs.getId());
		if(hs.isNew()) {
			pw.println("<br/> New Client");
		}else {
			pw.println("<br/> Old Client");
		}
		pw.println("</br> Session creation time in milli second format "+hs.getCreationTime());
		pw.println("</br> Session creation date format "+new Date(hs.getCreationTime()));
		pw.println("</br> session last access time  "+new Date(hs.getLastAccessedTime()));
		// default time is 3 min 
		pw.println("</br> session default set  "+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(800);
		pw.println("</br> session time set  "+hs.getMaxInactiveInterval());
		pw.println("<br/> Count value is "+count);
		count++;
		if(count%5==0) {
			hs.invalidate();			// destroy the session 
		}
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		response.setContentType("text/html");
		rd.include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
