<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upload</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	%>
	<%
		int cash = Integer.parseInt(request.getParameter("don"));
		String[] orderlist = request.getParameterValues("jepoom");

		int hap = 0;
		for (int i = 0; i < orderlist.length; i++) {
			if (orderlist[i].equals("흑당커피")) {
				hap += 2700;
			} else if (orderlist[i].equals("카페라떼")) {
				hap += 1700;
			} else if (orderlist[i].equals("카페모카")) {
				hap += 2000;
			} else if (orderlist[i].equals("에스프레소")) {
				hap += 3000;
			} else if (orderlist[i].equals("카푸치노")) {
				hap += 2500;
			} else if (orderlist[i].equals("아메리카노")) {
				hap += 900;
			}
		}

		int jan = cash - hap;
		if (jan < 0) {
			out.println("<h1>돈이 부족합니다.</h1>");
	%>
	<a href="JSP14.html"> 다시 주문 화면으로 </a>
	<%
		} else {
	%>
	<h1>
		잔액반환
		<%=jan%>원 입니다.
	</h1>
	<%
		for (int i = 0; i < orderlist.length; i++) {
				out.println(orderlist[i] + "구매하셨군요" + "<br>");
			}
		}
	%>
</body>
</html>