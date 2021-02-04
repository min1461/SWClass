package com.frontcontroller.my;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

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

		excuteImpl h1 = null;
		switch (c) {
		case "/getAllinfo.do":
			h1 = new excuteGetAllInfo();
			try {
				h1.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			str = "getAllInfo.jsp";
			break;

		case "/Telsearchone.do":
			h1 = new excuteSearchOne();
			try {
				h1.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			str = "getOneinfo.jsp";
			break;

		case "/SawonInsert.do":
			h1 = new excuteInsert();
			try {
				h1.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			str = "getAllinfo.jsp";
			break;

		case "/Telupdate.do":
			h1 = new excuteUpdate();
			try {
				h1.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			str = "getAllinfo.jsp";
			break;

		case "/TelDelete.do":
			h1 = new excuteDelete();
			try {
				h1.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			str = "getAllinfo.jsp";
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