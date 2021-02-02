package com.mycompany.sawon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */

			//urlmapping : url로 찾아갈때 /Hello이어야 한다. 단, jsp는 aa.jsp
@WebServlet("/Hello") //@ : annotation = 단점:너무간단해서 내용을 공부하지않으면 분석하기가 어렵다
//===> 클래스 위에서 사용 + web.xml 역할
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    		// 메소드 정의문
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		//jsp:out.이 있지만
		//servlet은 없기때문에 만들어야 한다. : response.getWriter()
		//'Served at: request.getContextPath()'
		//'Served at: /HelloServlet'
		
//		// 프로젝트명 경로 - /HelloServlet
//		response.getWriter().println(request.getContextPath());
//		
//		// 프로젝트명 + .java - /HelloServlet/Hello
//		response.getWriter().println(request.getRequestURI());
//		
//		// 전체경로 - http://localhost:8081/HelloServlet/Hello
//		response.getWriter().println(request.getRequestURL());
//		
//		// .java - /Hello
//		response.getWriter().println(request.getServletPath());
//		
//		// 절대경로 - C:\workspace_SW\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\HelloServlet\
//		response.getWriter().println(request.getRealPath("/"));
//		
//		// C:\workspace_SW\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\HelloServlet\
//		response.getWriter().println(request.getSession().getServletContext().getRealPath("/"));
		
		// charset=utf-8로 하겠다.
		response.setContentType("text/html;charset=UTF-8");
		
		// out.객체가 없으니까 만들어서 써야함
		PrintWriter out = response.getWriter();
		out.println("<h1>방가방가 Hello servlet</h1>");
		System.out.println("모야");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
			// 메소드 정의문
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet메소드가 여기있어서 doPost,doGet이 똑같은 방식으로 처리한다.
		doGet(request, response);
	}

}
