<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="JSP10_errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect</title>
</head>
<body>
	<%
		int na2soo1=Integer.parseInt(request.getParameter("irum"));
		out.println("나이는"+ na2soo1);
	%>
</body>
</html>