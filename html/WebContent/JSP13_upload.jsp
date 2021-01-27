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
		String bang = "c:/uploadroom";
		MultipartRequest mr1 = new MultipartRequest(request, bang, 10 * 1024 * 1024, "UTF-8",
				new DefaultFileRenamePolicy());

		String virum1 = mr1.getParameter("irum1");
		String vfilename1 = mr1.getFilesystemName("file1");

		if (vfilename1 != null) {
			out.println("사용자이름은 " + virum1 + "이시구요" + "<br>");
			out.println("추카추카 " + vfilename1 + "라는 파일 올리기 성공 했네요.");
		} else {
			out.println("에러");
		}
	%>
</body>
</html>
<!-- 
	# MultipartRequest(5개인자) //객체 생성이름의 예 : mr1 + ulpoad
	new MultipartRequest(request, bang, 10*1024*1024,
	"UTF-8", new DefaultFileRenamePolicy());
	
	request : 요청 객체
	bang : 사진같은 파일이 들어갈 곳 ==> 서버쪽의 upbang에 들어감
	10*1024*1024 : >1kb = 1024byte = 2^20 byte
			1024kb ==> 1mb    10mb ==> 올릴 최대 byte
	UTF-8 : 인코딩
	//DefaultFileRenamePolicy : 
	업로드시 bang에 이름이 같은 중복파일 존재시 처리할 정책
	//예) ondal.jpg또 ondal.jpg가 들어오면 ondal(1).jpg ondla(2).jpg
	
 -->