<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
													<!-- 접두사 : c -->
													<!-- con:together -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
	<!-- 상단에 taglib 태그가 없으면 14Line은 무시하고 실행 -->
	<c:out value="안녕 jstl"/><br>
	<%out.println("안녕 jstl"); %><br>
	
	<% String aa="chokich"; %>
	<%=aa %>
	
	<!-- [ jstl + el ] -->
	<c:set var="bb" value="chokichi"></c:set><br>
	${bb }<br> 
	
	
	<!-- [ jstl + el2 ] -->
	<% int jumsoo=100; %>
	<%=jumsoo %>
	<c:set var="jum">100</c:set><br>
	${jum }<br>
</body>
</html>