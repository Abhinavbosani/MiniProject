<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addEmployee">
<pre>
Enter Employee ID : <input type="text" name="eid"/><br>

Enter Employee Name :<input type="text" name="ename"/><br>

Enter Employee Salary :<input type="text" name="salary"/>

Enter Employee Designation :<input type="text" name="desg"/>

<input type="submit"/><br><br>
</pre>
</form>
<hr><br>
<h2> Retrieve Employee </h2>

<form action="getEmployee">
Enter Employee Id: <input type="text" name="eid"/><br>
<input type="submit"/><br><br>
</form><br>
<hr><br>
<h2> Delete Employee</h2>
<form action="deleteEmployee">
Enter Employee Id: <input type="text" name="eid"/><br>
<input type="submit"/><br><br>
</form>
<hr><br>
<h2> Update Employee</h2>
<form action="updateEmployee">
Enter Employee ID : <input type="text" name="eid"/><br>

Enter Employee Name :<input type="text" name="ename"/><br>

Enter Employee Salary :<input type="text" name="salary"/><br>

Enter Employee Designation :<input type="text" name="desg"/><br>

<input type="submit"/><br><br>
</form>

</body>
</html>