<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
 body {
    background: cadetblue;
}

center {
    padding: 35px;
}
</style>
<body>
<form action="Registretion_Controller" method="get">
<center>
<label for="registeration_no">Enter your Registration Number:</label><br>
 <input type="number" name="regno" size="30" required><br><br>

<label for="name">Enter your Name:</label><br>
<input type="text" name="name" size="30" required><br><br>

<label for="email">Enter your email:</label><br>
<input type="email" name="email"  size="30" required><br><br>

 <label for="username">Username:</label><br>
    <input type="text" name="uname" ><br><br>

  <label for="pass">Password (5 characters minimum):</label><br>
  <input type="password" name="pass" minlength="5" required><br><br>
  
  <label for="Account Balance For Opening">Account Balance For Opening:</label><br>
  <input type="text"  name="AccBal"><br><br>
 
    
    <input type="submit" value="Register" />
</center>
</form>
</body>
</html>