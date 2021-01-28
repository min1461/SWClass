<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] kwail = { "사과", "배", "감" };
		session.setAttribute("kwail", kwail);
		//kwail 이라는 속성명을 가진 기억창고에 배열을 넣어라 
		//name은 따옴표사용 , value는 기억창이면 따옴표 없이 , 문자열이면 따옴표 사용
	%>

	<a href="JSP17_Train3_each.jsp"> foreach개념인 for(:)을 사용</a>
</body>
</html>