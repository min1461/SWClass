<%@page import="java.io.FileInputStream"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@page import="java.io.File"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>download</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		String root = request.getSession().getServletContext().getRealPath("/");
		String sp = root + "upload";
		File file = new File(sp);
		String fname[] = file.list();

		out.write("<table border='2'>");
		int number = 1;
		for (String filename : fname) {
			out.write("<tr><td>다운" + number + "</td><td><a href='#?name'="
					+ java.net.URLEncoder.encode(filename, "UTF-8") + "\">" + filename + "</a></td></tr>");
			request.setAttribute("filename", filename);
			request.setAttribute("sp", sp);
			number++;
		}
		out.write("</table>");
	%>
	<%
		
	%>
</body>
</html>