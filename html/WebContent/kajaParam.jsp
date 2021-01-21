<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
안녕! 방가방가!
오늘도 즐거운 날입니다
열심히 공부하는 당신은 짱!@!@!@
<% String name=request.getParameter("name");//minkue이름을 받아서 String name에 넣어줌
/*scriptlet : 스크립틀릿 = 작은(let) 스크립트*/
/*아래쪽 태그는 이름이 experession*/%>
그리고 당신의 이름은 <%= name%> 이군요.