<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
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

<%
if(session.getAttribute("userid")!=null)
{
%>


<h1 class="display-5">Cars List</h1>
<hr>

<table class="table table-bordered table-hover">
<tr>
<th>Model Name
<th>Company
<th>Price
</tr>

<%
Connection con;
Statement st;
ResultSet rs;

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
st=con.createStatement();
rs=st.executeQuery("select * from cars");

while(rs.next())
{
	%>
	<tr>
	<td><%=rs.getString("modelnm")%>
	<td><%=rs.getString("company")%>
	<td><%=rs.getFloat("price")%>
	</tr>
	
	<%
}

con.close();			
}
catch(Exception e)
{
out.println(e);
}
%>

</table>

<%
}
else
{
	%>
	<h2>Invalid session</h2>
	<hr>
	<a href="Login.html">Please Login</a>
	<%
}

%>

</div>

</body>
</html>