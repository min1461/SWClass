package com.frontcontroller.my;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

/**
 * Servlet implementation class Sawonfrontcontroller
 */
@WebServlet("*.do")
// @WebServlet("/Sawonfrontcontroller") 를
public class Sawonfrontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sawonfrontcontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		// System.out.println(request.getRequestURI());
		// System.out.println(request.getContextPath());

		String c = request.getRequestURI().substring(request.getContextPath().length());
//		String c = "/Frontcontroller/getAllinfo.do".substring('/Frontcontroller'.length);

		String str = null;
		TelInfoDAO tidao1 = null;
		boolean b = false;
		ArrayList<TelInfoVO> alist1 = null;
		TelInfoVO tv1 = null; // businesslogic
		int id = 0;
		String name = null;
		String tel = null;
		String d = null;
		switch (c) {
		case "/getAllinfo.do":
			try {
				tidao1 = new TelInfoDAO();
				alist1 = tidao1.getAllInfo();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			request.setAttribute("alist", alist1);
			str = "getAllinfo.jsp";
			break;

		case "/Telsearchone.do":
			name = request.getParameter("name");
			try {
				tidao1 = new TelInfoDAO();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				tv1 = tidao1.getInfo(name);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			request.setAttribute("tv1", tv1);

			str = "getOneinfo.jsp";
			break;

		case "/SawonInsert.do":

			id = Integer.parseInt(request.getParameter("id"));
			name = request.getParameter("name");
			tel = request.getParameter("tel");
			d = request.getParameter("d");

			// 계산 및 판단 즉, business logic 은 서블릿에서 한다.
			try {
				tidao1 = new TelInfoDAO();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				b = tidao1.insert_nametel(id, name, tel, d);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b) {
				request.setAttribute("result1", "추가good");
			} else {
				request.setAttribute("result1", "추가오류");
			}

			str = "result.jsp";
			break;

		case "/Telupdate.do":
			name = request.getParameter("name");
			tel = request.getParameter("tel");
			// 계산 및 판단 즉, business logic 은 서블릿에서 한다.
			try {
				tidao1 = new TelInfoDAO();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				b = tidao1.update_nametel(tel, name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b) {
				request.setAttribute("result1", "수정good");
			} else {
				request.setAttribute("result1", "수정오류");
			}
			str = "result.jsp";
			break;

		case "/TelDelete.do":
			name = request.getParameter("name");
			try {
				tidao1 = new TelInfoDAO();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				b = tidao1.delete_nametel(name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (b) {
				request.setAttribute("result1", "삭제good");
			} else {
				request.setAttribute("result1", "삭제오류");
			}
			str = "result.jsp";
			break;
		}

		RequestDispatcher rd1 = request.getRequestDispatcher(str);
		rd1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}