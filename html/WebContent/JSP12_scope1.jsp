<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>scope</title>
</head>
<body>
	<% // JSP12.jsp ==> jsp12_scope.jsp
		//pageContext.setAttribute("page1", "pagelove");
		out.println((String)pageContext.getAttribute("page1"));
		//페이지가 넘어가서 null
		
		out.println((String)request.getAttribute("req1"));
		//forward, include가 있어야하는데 없으므로 null
		
		out.println((String)session.getAttribute("ses1"));
		//같은 브라우저내에서 전달받았으므로 seslove
		
		out.println((String)application.getAttribute("app1"));
		//return type : Object => String으로 형변환
	%>
	<br />
	<br />
	<br />
	
	<a href="JSP12_scope2.jsp">scope.jsp 한번 가볼까?!</a>
</body>
</html>