<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function loginuser(){
	
	alert("login sucessful");	
}
</script>
</head>
<body >
<Form name="f1" onsubmit="return loginuser()" action="login">
<h2>Login</h2>
<div>       Username : <input type="text" required name="uname"></div>
<div>       Password : <input type="password" required name="pwd" ></div>
<div><input type="submit" value="login"/></div>
<div></div>
<br>
<div> <a href="changepassword.jsp" >Change Password</a> </div>
<div> <a href="register.jsp" >New Registration</a> </div>
</Form>


</body>
</html>