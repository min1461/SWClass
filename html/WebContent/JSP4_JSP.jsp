<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인</h2>
	<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	%>
	
	<%//getParameter 방식
			//변수("박미래")			//input태그 name
	String id1 = request.getParameter("id1");
	String pw1 = request.getParameter("pw1");
	int years1 = Integer.parseInt(request.getParameter("years1"));
	%>
	아이디는<%= id1 %>이고 암호는 <%= pw1 %> 이고 <%=years1 %>살(<%=2021-years1 %>년생)이구만<p>
</body>
</html>