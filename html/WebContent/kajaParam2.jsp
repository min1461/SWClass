<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String name=request.getParameter("name");%>
<% String years=request.getParameter("years");%>
안녕하세요 <%= name%> 회원님
회원님이 입력하신 자료는
name=<%= name %>
years=<%=years%>
입니다.
입력하신 자료는
회원관리에 사용됩니다