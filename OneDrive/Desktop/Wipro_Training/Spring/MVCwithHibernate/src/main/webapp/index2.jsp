<html>
<head>
<%@include file="WEB-INF/views/base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3 ">Welcome to Employee App</h1>
				<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Gender</th>
      <th scope="col">Designation</th>
      <th scope="col">Salary</th>
      <th scope="col">City</th>
      <th scope="col">Email</th>
      <th scope="col">Mobile</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${emps }" var="e">
    <tr>
      <th scope="row">EID${e.id }</th>
      <td>${e.name }</td>
      <td>${e.gender }</td>
      <td>${e.designation }</td>
      <td>${e.salary }</td>
      <td>${e.city}</td>
      <td>${e.email }</td>
      <td>${e.mobile }</td>
      <td>
      	<a href="delete/${e.id }"><i class="fa-solid fa-trash"></i></a>
      </td>
    </tr>
   </c:forEach>
  </tbody>
</table>

<div class="container text-center">
<a href="add-emp" class="btn btn-outline-success">Add Employee</a>
</div>
			</div>
		
		
		
		
		
		</div>
	
	
	</div>
</body>
</html>
 