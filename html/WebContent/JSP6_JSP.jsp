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
		String textarea1 = request.getParameter("textarea1");

		String sql = "INSERT INTO TELTABLE7 VALUES(?,?)";
		pstmt1 = con1.prepareStatement(sql);
		pstmt1.setString(1, id1);
		pstmt1.setString(2, textarea1);
		pstmt1.executeUpdate(); //여기 query아님
	%>

	<a href="JSP7.html">검색</a>
</body>
</html>