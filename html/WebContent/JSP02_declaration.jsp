<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%-- 
    - jsp ��  html + �ڹ�( <% %> scriptlet)
    - <%@page import ��  import
    - <%@ : ���þ� ���ξ�   / <%@page : �������� ���� ���þ�� �� 
    - charset=EUC-KR�� ��Ŭ���̾�Ʈ�� ����޴� �������� ���ڵ����
    - page Encoding=EUC-KR��  jsp ��ü�� ���ڵ� ���
    --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%! /*���� (declaration) - !�� �ִ°� */ 
	String aa= "ondal";%>
	
</head>
<body>
	<%out.println(aa); %>	
	
	<%String aa2 ="ondal";
	out.println(aa2);%>
</body>
</html>