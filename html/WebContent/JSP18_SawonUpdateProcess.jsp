<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 전체 명단</title>
</head>
<body>
	<h1>사원 수정</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		TelInfoDAO tidao = new TelInfoDAO();

		String name = request.getParameter("name");
		String tel = request.getParameter("tel2");

		boolean b1 = tidao.update_nametel(tel, name);

		if (b1) {
			response.sendRedirect("JSP18_SawonAllView.jsp");
		} else {
	%>
	<a href="JSP18_SawonInsertForm.jsp">사원 수정 에러 - 수정화면으로</a>
	<%
		}
	%>
</body>
</html>