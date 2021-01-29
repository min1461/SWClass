<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 삭제</title>
</head>
<body>
	<h1>사원 삭제</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		TelInfoDAO tidao = new TelInfoDAO();

		String name = request.getParameter("name");

		boolean b1 = tidao.delete_nametel(name);

		if (b1) {
			response.sendRedirect("JSP18_SawonAllView.jsp");
		} else {
	%>
	<a href="JSP18_SawonDeleteForm.jsp">사원삭제 에러 - 삭제화면으로</a>
	<%
		}
	%>

</body>
</html>