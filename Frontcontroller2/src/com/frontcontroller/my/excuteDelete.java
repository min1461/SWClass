package com.frontcontroller.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class excuteDelete implements excuteImpl {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		TelInfoDAO tidao1 = null;
		String name = request.getParameter("name");

		tidao1 = new TelInfoDAO();
		tidao1.delete_nametel(name);
	}
}
