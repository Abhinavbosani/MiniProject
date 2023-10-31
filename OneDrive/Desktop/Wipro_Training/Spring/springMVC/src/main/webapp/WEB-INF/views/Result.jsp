<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>The Top Movies are :</h1><br><br>
<h3> ${list} </h3><br><br>
<h4>
The Movies in List :<br><br>
<c:forEach var="i" begin="0" end="9">
<c:out value="${i+1}. "/>
<c:out value="${list.get(i)}"/><br>
</c:forEach>
</h4>



</body>
</html>