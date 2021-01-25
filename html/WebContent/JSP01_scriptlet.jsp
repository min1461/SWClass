<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오늘 날짜 출력 (자바문법을 script하여서!) <br>
	<!-- Date date =new Date();  => java문법 -->
	<% 	// 이부분은 자바를 script하므로 scriptlet으로 묶어야함 
		//ctrl+스페이스바로 import 하면 자동완성됨 
		//<%@page import="java.util.Date"% >
	Date d1 = new Date(); 
	out.println("<h2>날짜출력</h2>"+" " +d1+"<p>");
	out.println(request.getRequestURI()+"로 요청한 url"+"<br>");
		//out ,  request(요청-응답 response): jsp 내장 객체  
	%>
	
	<!--out.println(d1)을 줄여서 사용  -->
	오늘날짜는 <%=d1 %> 입니다.
		<!-- d1의 내용 , expression 표현식 ,out.println()   -->
		

</body>
</html>