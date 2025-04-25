package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.bean.Product;
import com.pms.service.ProductService;

/**
 * Servlet implementation class ViewProductController
 */
@WebServlet("/ViewProductController")
public class ViewProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    String msg = "All Product details";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		ProductService ps = new ProductService();
		List<Product> listOfProdut =  ps.findAllProducts();
//		pw.println("<table border=1>");
//		pw.println("<tr><th>PId</th><th>PName</th><th>Price</th></tr>");
//		Iterator<Product> li = listOfProdut.iterator();
//		while(li.hasNext()) {
//			Product p = li.next();
//			pw.println("<tr>");
//			pw.println("<td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getPrice()+"</td>");
//			pw.println("</tr>");
//		}
//		pw.println("</table>");
		request.setAttribute("info", msg);		// set the value in request scope 
		request.setAttribute("listOfProducts", listOfProdut);	// set the list of product in request scope.
		RequestDispatcher rd = request.getRequestDispatcher("viewProduct.jsp");
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
