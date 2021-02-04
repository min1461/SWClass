<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String years = request.getParameter("years");
	%>
								<!-- 패키지명.클래스명 -->
	<jsp:useBean id="sawon1" class="Sawonpkg.Sawon"></jsp:useBean>
	<jsp:useBean id="sawon2" class="Sawonpkg.Sawon"></jsp:useBean>
	<!--	<jsp:useBean을 사용한다는 것은 
 			==> Sawon Sawon1 = new Sawon();
 			==> Sawon Sawon1 = new Sawon(); 이것과 같다.
 			스프렝이서는 <bean id="" class=""/>로 표현
	 -->
	 
	 <jsp:setProperty property="name" name="sawon1"/>
	 <jsp:setProperty property="years" name="sawon1"/>
	<!--	<jsp:setProperty을 사용한다는 것은 
 			Sawon1.setname(request.setParameter("name"));
 			Sawon1.setyears(request.setParameter("years"));  이것과 같다.
	 -->
	 
	 <jsp:setProperty property="*" name="sawon2"/>
	<!--	<jsp:setProperty에 property="*"을 사용한다는 것은 모든값을 넣는다는 것.
 			Sawon2.setname(request.setParameter("name"));
 			Sawon2.setyears(request.setParameter("years"));  이것과 같다.
 			getProperty는 안됨
	 -->
	 
	 <h2>jsp:getProperty출력</h2>
	 이름은<jsp:getProperty property="name" name="Sawon1"/><br />
	 나이는<jsp:getProperty property="years" name="Sawon1"/><br />
	 
	 <h2>jsp:getProperty출력2</h2>
	 이름은<jsp:getProperty property="name" name="Sawon2"/><br />
	 나이는<jsp:getProperty property="years" name="Sawon2"/><br />
</body>
</html>