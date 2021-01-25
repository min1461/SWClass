<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<!-- 기본타입 : .java - .class -실행
	.jsp를 만들어주면 - .java . class - 실행   
	
	.java 의 변환형태는 hello.jsp 라면
	hello_jsp.java(서블릿,웹자바 형식으로 변환됨
	
	## hello_jsp.java 파일이 있는 곳은 ? 
	C:\Users\UJung\Documents\swclass(프로젝트 폴더)
	\.metadata\.plugins\org.eclipse.wst.server.core
	\tmp(0,1,2)\work\Catalina\localhost
	\backend-jsp0122(프로젝트명)\org\apache\jsp\hello_jsp.java
	-->
	
	Q1. 34를 int에 넣은후 홀수인지 짝수인지 출력하는 프로그램을 jsp로 작성 <br><br>
	
	<% int a = 34;
	String result;
	if(a%2==0)
		result="짝수";
	else
		result="홀수";
	%>
	
	34는 ? <%=result %> <br>
	
	<!--강사님 버전 -->
	<% int num=34;
	if(num%2==0)
		out.println("짝수");
	else
		out.println("홀수");
		%>
	<hr><br>
	
	Q2. 간단한 로또 프로그램을 작성하시오 (scriptlet, expression사용) ,중복 ,순서 상관없음<br><br>
	<% Random r = new Random();
	int soo1 = r.nextInt(44)+1;
	int soo2 = r.nextInt(44)+1;
	int soo3 = r.nextInt(44)+1;
	int soo4 = r.nextInt(44)+1;
	int soo5 = r.nextInt(44)+1;
	int soo6 = r.nextInt(44)+1;
		%>
	로또번호는 : <%=soo1%>,<%=soo2%>,<%=soo3%>,<%=soo4%>,<%=soo5%>,<%=soo6%>
	<hr><br>
	
	Q3.구구단5단 출력 (scriptlet사용) /단,줄바꿈은br태그사용<br> 
	<% 
	for(int i=1;i<=9;i++){
		out.println("5 x"+i+"="+5*i);%>
		<br>
	<% } %>	
	<hr><br>
	
	Q4.구구단 출력<br>
	<% 
	for(int i=2;i<=9;i++){
		out.println("<h3>"+i+"단</h3>");
		for(int j=1;j<=9;j++){
		out.println(i+"x"+j+"="+i*j);%>
		<br>
	<% } %>
		<br><br>
	<% } %>
	
	
</body>
</html>