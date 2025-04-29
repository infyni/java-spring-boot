<%@page import="java.util.Iterator"%>
<%@page import="com.pms.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
	</tr>
<%
//Object obj = request.getAttribute("info");	// get the value from request scope 
Object obj = session.getAttribute("info");	// get the value from request scope 
out.println(obj);
//Object data = request.getAttribute("listOfProducts");
Object data = session.getAttribute("listOfProducts");
List<Product> listOfProduct = (List<Product>)data;		// type casting 
Iterator<Product> li = listOfProduct.iterator();
while(li.hasNext()){
	Product p = li.next();
		%>
		<tr>
		<td><%=p.getPid() %></td>
		<td><%=p.getPname() %></td>
		<td><%=p.getPrice() %></td>
		</tr>
		<% 
}
%>
</table>
<a href="index.html">Back</a>
</body>
</html>