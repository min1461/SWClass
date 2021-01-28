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
		ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
	%>
	<table border="2">
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>입사일</td>
		</tr>
		<%
			for (TelInfoVO imsi : tiArray) {
		%>
		<
		<tr>
			<td><%=imsi.getId()%></td>
			<td><a href="SawonDeletProcessR.jsp?name=<%=imsi.getName()%>"><%=imsi.getName()%></a></td>
			<td><%=imsi.getTel()%></td>
			<td><%=imsi.getD()%></td>
			<%
				}
			%>
		</tr>
	</table>
</body>
</html>