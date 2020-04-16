<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error{
 color:#EF1313;
 
}
.body
{
background-color: pink;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<form:form action="login" commmandName="user">
<form:input path="username"/>
<form:errors path="username"></form:errors>
<form:input path="address"/>
<form:errors path="address"></form:errors>
<form:input path="email"/>
<form:errors path="email"></form:errors>
<form:input path="mobile"/>
<form:errors path="mobile"></form:errors>
<form:input path="password"/>
<form:errors path="password"></form:errors>

<input type="submit" value="welcome">
</form:form>
</body>
</html>
