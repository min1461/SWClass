<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String irum=request.getParameter("irum");
		String tel=request.getParameter("tel");
		
		session.setAttribute("sirum", irum);
		session.setAttribute("stel", tel);
	%>
	
	<%if(tel.equals("bimil")){ %>
		<jsp:forward page="JSP16_Train2_impossible.jsp"/>
	<%}else{ %>
		<jsp:forward page="JSP16_Train2_homepage.jsp"/>
	<%} %>
</body>
</html>