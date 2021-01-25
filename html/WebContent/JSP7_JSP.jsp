<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//매번 써주어야함
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		PreparedStatement pstmt1 = null;
		ResultSet rs1 = null;
	%>
	<%
		//이부분은 나중에 dao에서 수정부분 //전화번호만 수정가능
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String id1 = request.getParameter("id1");

		String sql = "SELECT * FROM TELTABLE7 WHERE ID = ?";
		pstmt1 = con1.prepareStatement(sql);
		pstmt1.setString(1, id1);
		rs1 = pstmt1.executeQuery(); //여기 query아님
		while (rs1.next()) {
	%>
	<textarea name="textarea1" cols="50" rows="5"><%=rs1.getString("bigo")%></textarea>
	<br>
	<%
		}
		rs1.close();
		pstmt1.close();
		con1.close();
	%><!-- 
			여기서 주의 해야 할 점 
			textarea vs textarea 일때는 엔터가 잘 동작함
			그러나 그렇지 않은 경우 엔터가 정상동작하지 않을 수도 있음
			즉, 결과가 kim <br> male <br> seoul 이 아니라 kim male seoul로 나올 수 있다.
			why?! 개행은 \n이지만 JSP에서는 <br>만이 개행이므로 인식하지 않을수도 있기 때문.
			자바쪽에서 replace("\r\n","<br>")가 필요 할 수 있다.
		-->


	<a href="JSP6.html">입력초기화면으로</a>
	<a href="JSP7.html">검색화면으로</a>
</body>
</html>