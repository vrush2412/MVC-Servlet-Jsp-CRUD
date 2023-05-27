<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<style>
body {
    background: cadetblue;
}
</style>
</head>
<body>
<form action="Update_Controller">
<label for="registeration_no">Enter your Registration Number:</label><br>
 <input type="number" name="regno" size="30" required><br><br>
 
 <label for="username">Username:</label><br>
    <input type="text" name="uname" ><br><br>

  <label for="pass">Password (8 characters minimum):</label><br>
  <input type="password" name="pass" minlength="8" required><br><br>
  
  
    <label for="Account Balance For Opening">Account Balance :</label><br>
  <input type="text"  name="AccBal"><br><br>
  
  
<input type="submit" value="Update" />
</form>
</body>
</html>