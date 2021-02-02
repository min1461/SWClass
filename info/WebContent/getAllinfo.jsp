<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<!-- 
	MVC2  하는 방법
	1) input ==> servlet ==> output
	2) input ==> servlet ==> output(input과 output이 하나)
	3) 모두 하나의 servlet으로 처리하기
	4) servlet을 여러개 만들어서(즉, controller를 여러개 만들어서)사용하는 방법
 -->
	<table border="2">
		<tr>
			<td colspan="4">
				<form action="Telallview">
					<input type="submit" value="가자~모두보기" />
				</form>
			</td>
		</tr>
	</table>
</body>
</html>