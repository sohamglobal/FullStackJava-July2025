<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employee list using JSTL</h1>
<hr>

<ul>
<c:forEach var="emp" items="${elist}">
<li>${emp.employeeName}
</c:forEach>
</ul>


</body>
</html>