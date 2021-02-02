<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>사원전체보기</h1>
	<table border="1">
		<tr>
			<td colspan="4">
				<form action="getAllinfo.do" method="get">
					<!-- 1 controller를 찾아감 / .do를 붙여줌  -->
					<input type="submit" value="모두보기">
				</form>
			</td>
		</tr>
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>전화</td>
			<td>입사일</td>
		</tr>
		<c:forEach var="vo1" items="${alist}">
			<tr>
				<td>${vo1.id}</td>
				<td><a href="Telsearchone.do?name=${vo1.name}">${vo1.name}</a></td>
				<td>${vo1.tel}</td>
				<td>${vo1.d}</td>
			</tr>
		</c:forEach>
	</table>
	<table border=0>
		<tr>
			<td><a href="SawonInsert.jsp">[입력]</a></td>
		</tr>
	</table>
</body>
</html>