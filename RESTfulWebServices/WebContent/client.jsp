<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESTfullWebServices Client JSP</title>
</head>
<body>
<form method="POST" action="http://localhost:8080/RESTfulWebServices/backend/user/service">
Name: <input type=text name="name"/>
<input type=submit name=submit/>
</form>
</body>
</html>