<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>scriptlet</h2>
	<%
		String irum1 = request.getParameter("irum1");
		String irum2 = request.getParameter("irum2");
		out.println(irum1 + "가" + irum2 + "에게 말하기를" + "<br>");
		out.println("이 안에 너있다~~" + "<br>");
	%>
	
	<h2>el</h2>
	${param.irum1 }가 ${param.irum2 }에게 말하기를 <br>
	${"이안에 너있다. "}<br>
</body>
</html>