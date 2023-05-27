
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: cadetblue;
}
</style>
</head>
<body>
	<form action="Login_Controller">
		<center>
			<label for="username">Username:</label><br> <input type="text"
				name="uname"><br> <br> <label for="pass">Password
				(5 characters minimum):</label><br> <input type="password" name="pass"
				minlength="5" required><br> <br> <input
				type="submit" value="Login" />
		</center>
	</form>

	<%!String str = null;%>
	<%
	if (!session.isNew()) {
		str = (String) session.getAttribute("msg");
		session.invalidate();
	%>
	<h3 style="color: red"><%=str%></h3>
	<%
	}
	%>
</body>
</html>