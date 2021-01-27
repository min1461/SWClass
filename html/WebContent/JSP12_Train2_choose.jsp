<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
	<h2>쇼핑몰 상품을 선택하고 수량을 입력 후 장바구니에 담으세요</h2>
	<form action="JSP12_Train2_Cart.jsp">
		<select name="sangpum">

			<option value="bag">가방(1개 50000)</option>
			<option value="koodoo">구두(1개 70000)</option>
			<option value="tie">넥타이(1개 15000)</option>
		</select> <input type="text" name=cnt size=3>개 <br> <br> <input
			type="submit" value="장바구니담기"> <input type="reset" value="취소">

	</form>
</body>
</html>