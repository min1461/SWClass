<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��� ��ü ���</h1>
	<table border="2">
		<thead><tr><th>��ȣ</th><th>�̸�</th><th>��ȭ</th></tr>
		</thead>
		<tbody>
		<c:forEach var="imsi" items="${alist}">
		<tr>
		<td>${imsi.id }</td>
		<td>${imsi.name }</td>
		<td>${imsi.tel }</td>
		</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>