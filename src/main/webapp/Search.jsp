<%@page import="Reg.model.Register"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
<style>
body {
    background: cadetblue;
}
table {
    background: burlywood;
    border: solid;
}
</style>
</head>
<body>
	<form action="Search_Controller">
		<label for="registeration_no">Enter your Registration Number:</label><br>
		<input type="number" name="regno" size="30" required><br>
		<br> <input type="submit" value="Search" />
	</form>
	<%!  Register r;
 %>
	<%
    if(!session.isNew()){
    	r=(Register )session.getAttribute("data");
  %>
	<table>
		<tr>
			<td><%=r.getRegno() %></td>
			<td><%=r.getName() %></td>
			<td><%=r.getEmail() %></td>
			<td><%=r.getUname() %></td>
			<td><%=r.getPass() %></td>
		</tr>
	</table>
	<%} %>
	
	
</body>
</html>