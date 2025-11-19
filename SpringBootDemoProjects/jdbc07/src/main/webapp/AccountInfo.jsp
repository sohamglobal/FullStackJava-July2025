<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Account info for ${acc.accno}</h1>
<hr>
Name : ${acc.accnm}
<br>
Type : ${acc.acctype}
<br>
Balance : Rs. ${acc.balance}
<br><br>
<a href="/">Home</a> | 
<a href="search">Search more</a>

</body>
</html>