<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%><!-- isErrorPage : 에러페이지 -->
	<%response.setStatus(200); %><!-- 이페이지는 정상(200) -->
	<!-- 간혹가다가 200이아닌 다른 페이지로 인식하는 경우가 있기 때문에 setStatus를 이용해 강제로 정상페이지 취급 -->
<html>
<head>
<meta charset="UTF-8">
<title>errorPage</title>
</head>
<body>
	<pre>
	다음과 같은 에러가 발생했습니다
	계속 에러가 발생되면 상담원에게 전화주시기 바랍니다
	전화번호는 02-3456-7890 입니다
	</pre>
	<hr>
	<!-- 
		내장객체.메소드
		out request response exception 객체
		exception. ctrl+space
	 -->
	에러내용은<h3><%=exception.getMessage() %></h3>
	<!-- 
		예:나이를 빈칸으로 처리한 경우 에러내용은 For input string:""
		isErrorPage="true" 없으면 exception 객체 사용못함
	 -->
</body>
</html>