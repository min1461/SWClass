<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A학점</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String irum = request.getParameter("irum");
		int score = Integer.parseInt(request.getParameter("score"));
	%>
	<form action="scoretable.html">
		<table>
			<tr>
				<td>이름</td>
				<td>점수</td>
				<td>학점</td>
			</tr>
			<tr>
				<td><%=irum%></td>
				<td><%=score%></td>
				<td>A학점</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="다른학생학점입력하러가기" /></td>
			</tr>
		</table>
	</form>
</body>
</html>