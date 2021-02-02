<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>사원 추가</h1>
	<form action="SawonInsert.do" method="post">
		<table border="1">
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>입사일</th>
			</tr>
			<tr>
				<td><input type="text" name="id" required/></td>
				<td><input type="text" name="name" required/></td>
				<td><input type="text" name="tel" required/></td>
				<td><input type="text" name="d" required/></td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" value="가자 추가하러 " />
					<input type="reset" value="취소하기" />	
				</td>
			</tr>
		</table>
	</form>
	<a href="getAllinfo.do">[모두보기]</a>
</body>
</html>