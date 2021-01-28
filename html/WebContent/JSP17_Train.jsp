<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl if</title>
</head>
<body>
	<!-- request.getParameter() 대신 다른것이 무엇????? -->
	<form action="JSP17_Train_this.jsp">
		<label for="hobby">취미는</label><br>
		<select name="chimi">
			<option value="tennis">tennis</option>
			<option value="soccer">soccer</option>
			<option value="golf">golf</option>
		</select> 
		<input type="submit" value="가자">
	</form>
</body>
</html>
