<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sp:form action="InsertDepartment" method="post" modelAttribute="department">
Enter Department No: <sp:input path="deptno"/><br>
Enter Department Name: <sp:input path="dname"/><br>
Enter Department Location: <sp:input path="loc"/><br>
<input type="submit"/>



</sp:form>

</body>
</html>