<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page</h2>
<form action="checkLogin" method="post">
<label>EmailId</label>
<input type="email" name="emailid"/><br/>
<label>Password</label>
<input type="password" name="password"/><br/>
<input type="submit" value="SignIn"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>