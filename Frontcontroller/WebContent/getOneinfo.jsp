<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>한명 출력</h1>
	<form action="Telupdate.do">
		<table border="1" style="border-collapse: collapse;">
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>입사일</th>
			</tr>
			<tr>
				<td><input type="text" value="${tv1.id }" name="id" /></td>
				<td><input type="text" value="${tv1.name }" name="name" /></td>
				<td><input type="text" value="${tv1.tel }" name="tel" /></td>
				<td><input type="text" value="${tv1.d }" name="d" /></td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" value="수정 " />
					<input type="reset" value="취소" />
				</td>
			</tr>
		</table>
	</form>
	<a href="${pageContext.request.contextPath}/getAllinfo.jsp">[모두보기]</a>
	<a href="TelDelete.do?name=${tv1.name}">[위 사원 삭제]</a>
</body>
</html>