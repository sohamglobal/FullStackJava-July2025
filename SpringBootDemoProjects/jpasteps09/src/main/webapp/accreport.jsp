<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Accounts Report</h1>
<hr>
<ul>
<c:forEach items="${acclist}" var="ac">
<li>${ac.accnm}
</c:forEach>
</ul>
</body>
</html>