<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
<h3>Add Employee</h3>
    <form action="AddHandle" method="post">
  <label for="Name">Name:</label>
  <input type="text" id="name" name="name"><br><br>
  <label for="Gender">Gender:</label>
  <input type="text" id="gender" name="gender"><br><br>
  <label for="Designation">Designation:</label>
  <input type="text" id="designation" name="designation"><br><br>
  <label for="Salary">Salary:</label>
  <input type="text" id="salary" name="salary"><br><br>
  <label for="City">City:</label>
  <input type="text" id="city" name="city"><br><br>
  <label for="Email">Email::</label>
  <input type="text" id="email" name="email"><br><br>
  <label for="Mobile">Mobile:</label>
  <input type="text" id="mobile" name="mobile"><br><br>
        <input type="submit" value="Add Employee">
    </form>

</body>
</html>
