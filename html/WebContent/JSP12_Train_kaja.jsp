<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Training-scope</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	%>
	아이디는
	<%=id%>이고 암호는
	<%=pw%>이군요
	
	<%
		session.setAttribute("sid1", id);
		session.setAttribute("spw1", pw);
	%>

	커피구매 <a href="JSP12_Train_coff.jsp">여기</a>를 누르세요
	<br>
	빵구매 <a href="JSP12_Train_shoe.jsp">여기</a>를 누르세요
	<br>
</body>
</html>