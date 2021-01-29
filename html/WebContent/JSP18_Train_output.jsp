<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등급 결과</title>
</head>
<!-- mvc2 = m:DB v:jsp c:servlet -->
<body>
	<%
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		int score = Integer.parseInt(request.getParameter("score"));
		String grade = "";
	%>
	<%
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A학점";
			break;
		case 8:
			grade = "B학점";
			break;
		case 7:
			grade = "C학점";
			break;
		case 6:
			grade = "D학점";
			break;
		default:
			grade = "F학점";
			break;
		}
	%>
	
	<form action="JSP18_Train_input.html">
		<table>
			<tr>
			<td>이름</td><td>점수</td><td>학점</td></tr>
			<tr>
				<td><%=name %></td>
				<td><%=score %></td>
				<td><%=grade %></td>
			</tr>
			<tr><td colspan="3"><input type="submit" value="다른학생학점입력하러가기"/></td></tr>
		</table>
	</form>
</body>
</html>