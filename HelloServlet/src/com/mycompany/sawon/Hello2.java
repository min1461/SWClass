package com.mycompany.sawon;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello2
 */
@WebServlet("/Hello2")
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//전송
	// marshalling - unmarshalling 
	// serialization - deserialization
	// 객체는 그냥보내면 안됨
	// xml or binary(serialization:직렬화)
	// 개체 - serialization - binary - deserialization - 개체
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("나 init이야");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("나 destroy야");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("나 service야");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
/* 	
 *	서블릿의 lifecycle
 *	자바에서의 객체생성 - 초기치(생성자) .... 객체소멸(소멸자)
 *	첫가동 : init,service(쓰레드) - 두번째부터는 service(쓰레드)만
 *	소멸 : destroy(was를 내리면)
 */