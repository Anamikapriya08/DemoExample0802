<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="A"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
		<h1>Welcome To E-Learning</h1>
		<A:form method="POST" action="verLogin.obj" modelAttribute="ver">
		UserName:<A:input path="userName"/><A:errors path="userName" cssStyle="color:red"/>
		Password:<A:input path="password"/><A:errors path="password" cssStyle="color:red"/>
		<input type="submit"value="login">&nbsp;&nbsp:<input type="reset" value="clear">
		
		</A:form>
		<br>
		<bstyle="color:red;">${msg }</b>

	</center>

</body>
</html>