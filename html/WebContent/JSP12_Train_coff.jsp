<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Training-scope</title>
</head>
<body>
	<h2>커피 구매하러왔다</h2>
	<%String sid1=(String)session.getAttribute("sid1");
	String spw1=(String)session.getAttribute("spw1");
	
	if(!sid1.equals("babo")||!spw1.equals("ondal")){
		out.println("<h2>id 암호를 바르게 입력하세요 로그인화면으로갑니다.</h2>");
		out.println("<a href='JSP12_Train_Login.html'>여기</a>)를 누르세요");
	}else{
		out.println("<img src='./img2/americano.jpg'>");
	}
	
	%>
</body>
</html>