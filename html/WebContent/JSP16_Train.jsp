<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- do you remember -->
	<!-- input type=text name="irum1" value="jehoon" -->
	<!-- 여기태그주의 action tag는 xml 규칙 -->

	<jsp:include page="JSP16_Train_includeparam.jsp">
		<jsp:param name="irum1" value="jehoon" />
		<jsp:param name="irum2" value="soobin" />
	</jsp:include>
	<!-- xml에서 br태그인 경우 <br> 대신 <br/> -->
</body>
</html>