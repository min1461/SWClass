<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>구입 내역</h2>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String productnum = request.getParameter("productnum");
		String[] checkbox = request.getParameterValues("checkbox1");
		//배열에 여러개를 담을수있음(유동적 배열)
		String payment = request.getParameter("payment");
		//라디오버튼은 1개만
	%>
	<table border="2" width="500">
		<tr>
			<td>제품종류번호 및 제목</td>
			<td>
				<%
					if (productnum != null) {
						out.println(productnum);
					}
				%>
			</td>
		</tr>
		<tr>
			<td>제품선택</td>
			<td>
				<%
					if (checkbox != null) {
						for (int i = 0; i < checkbox.length; i++) {
							out.println(checkbox[i] + "<br>");
						}
					}
				%>
			</td>
		</tr>
		<tr>
			<td>결제방법</td>
			<td>
				<%
					if (payment != null) {
						out.println(payment);
					}
				%>
			</td>
		</tr>
		<tr>
			<td colspan="2">처음으로 돌아가려면 <a href="JSP5.jsp">여기</a>를 누르세요.
			</td>
		</tr>
	</table>
</body>
</html>