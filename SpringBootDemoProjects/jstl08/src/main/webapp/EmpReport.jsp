<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<h1 class="display-4">Employee report using JSTL</h1>
<hr>

<table class="table table-bordered table-hover">
<tr>
<th>Number
<th>Name
<th>Department
<th>Post
<th>Location
<th>Salary
</tr>

<c:forEach var="emp" items="${elist}">
<tr>
<td>${emp.employeeNumber}
<td>${emp.employeeName}
<td>${emp.department}
<td>${emp.post}
<td>${emp.location}
<td style="color:red">${emp.salary}
</tr>
</c:forEach>



</table>


</div>
</body>
</html>