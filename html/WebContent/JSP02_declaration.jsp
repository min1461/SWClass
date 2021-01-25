<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%-- 
    - jsp 는  html + 자바( <% %> scriptlet)
    - <%@page import 로  import
    - <%@ : 지시어 접두어   / <%@page : 페이지에 대한 지시어란 뜻 
    - charset=EUC-KR은 웹클라이언트가 응답받는 페이지의 인코딩방식
    - page Encoding=EUC-KR은  jsp 자체의 인코딩 방식
    --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%! /*선언문 (declaration) - !가 있는것 */ 
	String aa= "ondal";%>
	
</head>
<body>
	<%out.println(aa); %>	
	
	<%String aa2 ="ondal";
	out.println(aa2);%>
</body>
</html>