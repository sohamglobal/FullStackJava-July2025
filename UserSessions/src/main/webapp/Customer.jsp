<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br><br>

<h1 class="display-5">Customer Home page</h1>
Logged in as <%=session.getAttribute("userid") %>
<hr>
<a href="CarsList.jsp">Cars List</a>
<br>
<a href="Logout">Logout</a>

<%
String city="Mumbai";
%>
</div>
</body>
</html>