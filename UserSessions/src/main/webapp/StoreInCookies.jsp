<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Saving data in cookies...</h1>
<hr>
<%
String cho=request.getParameter("choice");
Cookie c1=new Cookie("userchoice",cho);
//c1.setMaxAge(30); //seconds
response.addCookie(c1);
%>
<br>
<a href="ShowMyCookies.jsp">Show Cookies</a>
</body>
</html>