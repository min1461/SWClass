<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- ####### include -->
<meta charset="UTF-8">
<title>include</title>
</head>
<body>
	<h2>include 지시어 파일 포함하기</h2>
	우리 회사는 작지만 확실한 행복을 보장하는 이벤트를 드립니다<br>
	방문을 환영합니다<br>
	<hr />
	<%@ include file="JSP11_include.jsp" %>
</body>
</html>
<%--
	include 지시어						action tag
		└ 포함하다(포함시켜서 함께 수행), 			└ 포함하다(먼저실행하고 그 결과를 포함시킴)
		.js 같은 정적 페이지						jsp같은 동적 페이지
		<%@ include file="aa.jsp"%> 		<jsp:forward page="aa.jsp">
--%>