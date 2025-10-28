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
		
		
		
		if(c[i].getValue().equals("football"))
		{
			%>
			<br>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/ZdEYyXsewhQ?si=48LkKIrShf7uW0ho" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
			<%
		}
		
		if(c[i].getValue().equals("news"))
		{
			%>
			<br>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/YDvsBbKfLPA?si=Ry81RzV8bzb_joR8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
			<%
		}
		
	}
}
else
	out.println("No cookies found");
%>

</body>
</html>