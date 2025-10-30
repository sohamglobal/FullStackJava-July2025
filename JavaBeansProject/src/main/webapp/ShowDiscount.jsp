<%@page import="com.praffull.services.DiscountCalculator"%>
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
<h1 class="display-5">Calling Discount calculator bean...</h1>
<hr>

<%
String name=request.getParameter("cnm");
double amount=Double.parseDouble(request.getParameter("amt"));
DiscountCalculator obj=new DiscountCalculator();
obj.setPurchAmount(amount);
%>

<h4>Name : <%=name%>
<br>
Amount : <%=amount%>
<br>
Discount : <%=obj.getDiscount()%>
</h4>


<br>
<a href="index.html">Home</a>
</div>
</body>
</html>