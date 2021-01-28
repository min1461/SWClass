<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order</title>
</head>
<body>
	<%
		double kab = 37.8;
		String kab2 = null;
	%>
	<%="온달"%>
	<!-- 표현식 -->
	${"온달"}
	<!-- el방식 -->

	${"형이 말하는데 el 네가 왜 거기서 나와" }
	<br> ${"el"}은 참 간단해서 좋지만 공부는 해야해
	<br> ${"다음 el의 답은 뭘까?" }
	<br> ${100 } ${100+200 } ${100>2 } ${200.35 } ${10%3 }
	<br> ${false } ${empty kab2} ${empty "" } ${empty "a" } ${null } 등
	같은 표현이 가능해 문자형*숫자
	<br>
	<%=Integer.parseInt("100") * 200%><br> ${"100"*200 } ${ 50 == 50 }
	<br> ${ 50 eq 50 }
	<br> ${(100>3)?"커":"작아" }
	<br> ${ 51 mod 50 }
	<!-- 나머지 -->

	${"하하 vs 호호 "}
	<br>
	<%
		out.println("하하 vs 호호");
	%><br>

	<%!String hahahoho = "하하 vs 호호";%><!-- declaration -->
	<%=hahahoho%>
</body>
</html>