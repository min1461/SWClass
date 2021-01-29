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
	<%
		request.setCharacterEncoding("UTF-8");
		TelInfoDAO tidao = new TelInfoDAO();

		String name = request.getParameter("name");
		String tel = request.getParameter("tel");

		TelInfoVO tv2 = tidao.search_nametel(name);
	%>
	<form action="JSP18_SawonDeleteProcess.jsp">
		<table border="2">
			<tr>
				<td>사번</td>
				<td>이름</td>
				<td>전화번호</td>
				<td>입사일</td>
			</tr>
			<tr>
				<td><input type="text" name="id" value=<%=tv2.getId()%>
					readonly></td>
				<td><input type="text" name="name" value=<%=tv2.getName()%>
					readonly></td>
				<td><input type="text" name="tel" value=<%=tv2.getTel()%>
					readonly></td>
				<td><input type="text" name="sDate" value=<%=tv2.getD()%>
					readonly></td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="사원 전화번호 수정" /></td>
			</tr>
		</table>
		<!-- 
			
		 -->
		<table border=0>
			<tr>
				<td><a href="JSP18_SawonInsertForm.jsp">[입력]</a></td>
				<td><a href="JSP18_SawonUpdateForm.jsp">[수정]</a></td>
				<td><a href="JSP18_SawonDeleteForm.jsp">[삭제]</a></td>
				<td><a href="JSP18_SawonAllView.jsp">[전체보기]</a></td>
			</tr>
		</table>
	</form>
</body>
</html>