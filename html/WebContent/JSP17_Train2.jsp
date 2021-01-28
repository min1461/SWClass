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
		String[] kwail = (String[]) session.getAttribute("kwail");
		//세션의 속성명
		for (String imsi : kwail) { //하나씩 꺼내서 출력
			out.println(imsi + "<br>");
			//자바에서는 for ( : )
			//자바스크림트에서는 for( in )
		}
	%>

</body>
</html>