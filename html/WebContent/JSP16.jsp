<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<pre>
include directive : 내용을 그대로 인클루드
<%-- <%@ include file ="includeSub.jsp" %>
정적 파일을 포함시킬때 포함 후 처리가 된다 --%>

include action tag : html, jsp등의 처리결과를 include

</pre>
	<jsp:include page="JSP16_include.jsp" />
	<!-- 나 누구라고? 맞아 액션태그 jsp에서 다른 jsp를 include하는중 -->
	<!-- 맨뒤에 /를 써주어야함 -->
</body>
</html>