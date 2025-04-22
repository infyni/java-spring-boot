package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		// check with simple if statement 
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			pw.println("Successfully login with get method");
			rd1.forward(request, response);    // output only target page. 
		}else {
			pw.println("Failure try once again with get method");
			rd2.include(request, response);			// soure + target page as one page. 
		}
		response.setContentType("text/html");   // consider output as html page 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		// check with simple if statement 
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			pw.println("Successfully login with post method");
			rd1.forward(request, response);    // output only target page. 
		}else {
			pw.println("Failure try once again with post method");
			rd2.include(request, response);			// soure + target page as one page. 
		}
		response.setContentType("text/html");   // consider output as html page 
	}

}
