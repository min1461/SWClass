<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	%>
	[scriptlet]<br>
	<%
		String irum = request.getParameter("irum");
		int korscore = Integer.parseInt(request.getParameter("kor"));
		int engscore = Integer.parseInt(request.getParameter("eng"));
	%>
	이름<%=irum%><br> 총점<%=korscore + engscore%>
	<br>
	[el]
	<br> 이름 ${param.irum}
	<br> 이름 ${param.kor + param.eng}
	<br>
</body>
</html>