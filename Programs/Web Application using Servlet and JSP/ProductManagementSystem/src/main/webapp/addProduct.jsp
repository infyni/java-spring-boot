<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add Product Operation</h2>
<form action="AddProductController" method="post">
	<label>PId</label>
	<input type="number" name="pid"/><br/>
	<label>PName</label>
	<input type="text" name="pname"/><br/>
	<label>Price</label>
	<input type="number" name="price"/><br/>
	<input type="submit" value="Add Product"/>
	<input type="reset" value="reset"/>
</form>

<a href="index.html">Back</a>
</body>
</html>