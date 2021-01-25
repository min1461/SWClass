<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 
	브라우저 알아내기,
	브라우저엔진(크롬 & Opera-Blink, 사파리-webkit, FireFox-gecko(모질라),
	IE-Trident, Mac IE에 탑재된 것은 tasman(ms의 레이아웃엔진)
	layout engine : Rendering engine이라고도 하며
	html, css 정의 형태대로 화면에 보여주게 하는 SW
 -->
<title>Insert title here</title>
</head>
<body>
	getHeader --> <%= request.getHeader("user-agent") %><br>
	<!-- 
	Mozilla/5.0 (Windows NT 10.0; Win64; x64)
	AppleWebKit/537.36 (KHTML, like Gecko)
	Chrome/87.0.4280.141
	Safari/537.36
	 -->
	 
	RequestURI --> <%=request.getRequestURI() %><br>
	<!-- 	★★/html/JSP8.jsp(/프로제트명을 포함한 경로명/jsp명)★★	 -->
	 
	ServletPath --> <%=request.getServletPath() %><br>
	<!-- 	★★/JSP8.jsp(/경로명/jsp명)★★	 -->
	 
	ServerName --> <%=request.getServerName() %><br>
	<!-- 	localhost	 -->
	 
	ServerPort --> <%=request.getServerPort() %><br>
	<!-- 	8081	 -->
	 
	Protocol --> <%=request.getProtocol() %><br>
	<!-- 	HTTP/1.1	 -->
	 
	Method --> <%=request.getMethod() %><br>
	<!-- 	get	 -->
</body>
</html>