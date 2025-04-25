<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int a,b,sum;		// instance variable 
%>
<%
	//int a;
	//int b;
	a=10;
	b=20;
	sum = a+b;
	System.out.println("Welcome to JSP on console");
	out.println("Welcome to JSP on browser<br/>");
	out.println("Sum of two number is "+sum);
	out.println("<br/><b> Sum of two number is "+sum+"</b>");
%>
<p>Sum of two number is <%=100+200 %></p>
<font color="red" face="arial">Sum of <%=a %> and <%=b %> is <%=sum %></font>
</body>
</html>