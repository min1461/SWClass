<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>A학점</title>
</head>
<body>
	<form action="JSP18_Train2_input.html">
		<table>
			<tr>
				<td>이름</td>
				<td>점수</td>
				<td>학점</td>
			</tr>
			<tr>
				<td>${param.name }</td>
				<td>${param.score }</td>
				<td>F학점</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="다른학생학점입력하러가기" /></td>
			</tr>
		</table>
	</form>
</body>
</html>