<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu</title>
</head>
<body>
	<h3 align="center">Main Menu</h3>
	Thanks Mr./Ms. ${ sessionScope.userFullName}
	<ul>
		<li><a href="empList.do">View Employee List</a></li>
		<li><a href="newJoining.do">Add New Employee</a></li>
	</ul>
</body>
</html>