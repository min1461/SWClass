<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- ####### include -->
<meta charset="UTF-8">
<title>scope</title>
</head>
<body>
	<%
		/* 범위에서 해당 값인식을 위해 */
		pageContext.setAttribute("page1", "pagelove");
		request.setAttribute("req1", "reqlove");
		session.setAttribute("ses1", "seslove");
		application.setAttribute("app1", "applove");
	%>
	
	<a href="JSP12_scope1.jsp">scope.jsp 한번 가볼까?!</a>
</body>
</html>
<%--
	장바구니(shopping carter)
	아마존고 시애틀
	
	장바구니 : 청바지 담고 노트북 구경 그리고 왔더니 청바지 담은게 취소
	그래서 웹브라우저를 닫지 않는 한 장바구니는 계속 유지가 되어야 함
	
	범위 : scope
	pageContext < request < sesstion < application
	pageContext : 같은 패이지 내에서의 범위
	request : 요청범위
	sesstion : 브라우저가 살아있는 동안 범위
	application : WAS(server)를 닫지 않는 내에서의 범위
	
	https://m.blog.naver.com/PostView.nhn?blogId=good_ray&logNo=221325440532&proxyReferer=https:%2F%2Fwww.google.com%2F
	
	("속성명","값")으로 전달을 함
	
--%>