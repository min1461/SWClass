<%@ contentType ="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- ####### include -->
<meta charset="UTF-8">
<title>include</title>
</head>
<body>
	<table border="2" width="500">
		<tr>
			<td colspan="2"><jsp:include page="JSP11_Train_header.jsp"></td>
									<!-- action Tag 방식 -->
		</tr>
		
		
		<tr height="400">
			<td width="200"><jsp:include page="JSP11_Train_nav.jsp"></td>
									<!-- action Tag 방식 -->
			<td width="300"><%@ include file="JSP11_Train_content.jsp"%></td>
									<!-- include 방식 -->
		</tr>
		
		
		<tr height="50">
			<td colspan="2"><%@ include file="JSP11_Train_footer.jsp"%></td>
									<!-- include 방식 -->
		</tr>
	</table>
</body>
</html>