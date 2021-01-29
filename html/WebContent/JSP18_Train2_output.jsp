<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등급 결과</title>
</head>
<!-- mvc2 = m:DB v:jsp c:servlet -->
<body>
	<%
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		int score = Integer.parseInt(request.getParameter("score"));
		String grade = "";
	%>
	<%
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
	%>
	<!-- 
		view역할을 하는 jsp가 필요
		방법은 학점처리를 하는 별도의 jsp가 처리하도록 해야한다
		그러므로 jsp는 5개 A.jsp,B.jsp....F.jsp
		즉, 다른페이지에서 학점인자값도 가지고 가려면?
		1) sendRedirect():인자를 보내려면 get방식이면서 getparameter...등등 사용해야함 복잡
		2) request.forward():scope로 인자를 보낼수 있음
	 -->

	<!-- 다른속성을 추가하고싶으면 request.setAttribute써서 가지고 올 수 있다. -->
	<%
	 	if(grade.equals("F")){
	 		request.setAttribute("reload", "재수강하세요");
	 	}
	 	RequestDispatcher rd1 = request.getRequestDispatcher("/jsp18View/"+grade+".jsp");
	 	rd1.forward(request, response);
	 %>
</body>
</html>