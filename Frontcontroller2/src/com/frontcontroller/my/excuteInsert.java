package com.frontcontroller.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class excuteInsert implements excuteImpl {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		TelInfoDAO tidao1 = null;

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String d = request.getParameter("d");

		tidao1 = new TelInfoDAO();
		tidao1.insert_nametel(id, name, tel, d);
	}
}
