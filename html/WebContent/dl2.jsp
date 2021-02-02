<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String filename = request.getParameter("filename");
		File file = new File(filename);
		out.write("파일명 : " + filename);

		/* String mimetype = getServletContext().getMimeType(file.toString());
		if(mimetype == null)
		{
		   response.setContentType("application/octet-stream");
		}
		
		String downname = null;
		if(request.getHeader("user-agent").indexOf("MSIE") == -1)
		{
		   downname = new String(filename.getBytes("UTF-8"),"8859_1");
		}
		else
		{
		   downname = new String(filename.getBytes("EUC-KR"),"8859_1");
		
		response.setHeader("Content-Disposition", "attachment;filename=\""+downname+"\";");
		
		FileInputStream fileinputstream = new FileInputStream(file);
		ServletOutputStream servletoutputstream = response.getOutputStream();
		
		byte b [] = new byte[1024];
		int data = 0;
		while((data=(fileinputstream.read(b,0,b.length)))!=-1)
		{
		   servletoutputstream.write(b,0,data);
		}
		servletoutputstream.flush();
		servletoutputstream.close();
		fileinputstream.close(); */
	%>
</body>
</html>