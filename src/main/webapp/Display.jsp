<%@page import="Reg.Dao.RegisterImpl"%>
<%@page import="Reg.Dao.RegisterInterface"%>
<%@page import="Reg.model.Register"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">

</head>
<body>
	<form action="Display_Controller">
		
	</form>
	
	<!--     java standard tag librariy (jstl) -->   
	
	<c:if test=""></c:if>
	<c:if test="${requestScope.empList !=null and 
	not empty requestScope.empList}">
	<table border="1"  cellpadding="3">
	  <tr>
				<th scope="col">Register No.</th>
				<th scope="col">Name</th>
				<th scope="col">Email Id</th>
				<th scope="col">UserName</th>
				<th scope="col">PassWord</th>
				<th scope="col">AccBal</th>
			</tr>
			<c:forEach items="${requestScope.empList }" var="e">
			  <tr>
			<td class="table-success">${e.regno }</td>
			<td class="table-success">${e.name }</td>
			<td class="table-success">${e.email }</td>
			<td class="table-success">${e.uname }</td>
			<td class="table-success">${e.pass }</td>
			<td class="table-success">${e.accbal }</td>
        </tr>
			</c:forEach>
	</table></c:if>
	
	
</body>
</html>