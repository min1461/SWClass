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
	<h1>사원 추가</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		TelInfoDAO tidao = new TelInfoDAO();

		int id = Integer.parseInt(request.getParameter("id"));

		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String sDate = request.getParameter("sDate");

		boolean b1 = tidao.insert_nametel(id, name, tel, sDate);

		if (b1) {
			response.sendRedirect("JSP18_SawonAllView.jsp");
		} else {
	%>
	<a href="JSP18_SawonInsertForm.jsp">사원입력 에러 - 입력화면으로</a>
	<%
		}
	%>
</body>
</html>