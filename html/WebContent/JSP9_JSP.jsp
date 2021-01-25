<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect</title>
</head>
<body>
	<pre>
		(화면 경로변경)
		원래는 이 화면이 출력되는 것인데
		변신을 해서 다른 화면이 출력 된다.
	</pre>
	<%
		response.sendRedirect("JSP9_JSP_RD.jsp");
	%>
	로그인 하고 왔어~ 안했어~ 다시 로그인화면으로 보내자.
</body>
</html>