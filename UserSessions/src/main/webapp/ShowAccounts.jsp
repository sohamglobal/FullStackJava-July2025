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
String ty=request.getParameter("typ");
%>


<h1 class="display-5">Accounts information for <%=ty%></h1>
<hr>

<table class="table table-bordered table-hover">
<tr>
<th>Number
<th>Name
<th>Type
<th>Balance
</tr>

<%
Connection con;
PreparedStatement pst;
ResultSet rs;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
	pst=con.prepareStatement("select * from accounts where acctype=?");
	pst.setString(1,ty);
	rs=pst.executeQuery();
	while(rs.next())
	{
		%>
		<tr>
		<td><%=rs.getInt("accno")%>
		<td><%=rs.getString("accnm")%>
		<td><%=rs.getString("acctype") %>
		<td><%=rs.getFloat("balance") %>
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



</div>

</body>
</html>