<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Now Showing...cookies</h1>
<hr>
<%
Cookie c[]=request.getCookies();

if(c!=null)
{
	for(int i=0;i<c.length;i++)
	{
		out.println("<br>Name : "+c[i].getName());
		out.println("<br>Value : "+c[i].getValue());
	}
}
else
	out.println("No cookies found");
%>

</body>
</html>