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
	<h1>사원전체명단</h1>
	<%
		request.setCharacterEncoding("UTF-8");//post방식 - 요청이 들어왔을때 UTF-8로 처리
		TelInfoDAO tidao = new TelInfoDAO();//객체 생성
		ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();//DAO에 정의되어있음, 전체출력 메소드
	%>

	<table border=2>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>입사일</td>
		</tr>
		<% for(TelInfoVO imsi : tiArray){ %>
		<tr>
			<td><%=imsi.getId() %></td>
			<td><%=imsi.getName() %></td>
			<td><%=imsi.getTel() %></td>
			<td><%=imsi.getD() %></td>
		<%} %>
		</tr>
	</table>
	<table>
		<tr>
			<td><a href="JSP18_SawonInsertForm.jsp">[입력]</a></td>
			<td><a href="JSP18_SawonUpdateForm.jsp">[수정]</a></td>
			<td><a href="JSP18_SawonDeleteForm.jsp">[삭제]</a></td>
		</tr>
	</table>
</body>
</html>