package com.frontcontroller.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class excuteUpdate implements excuteImpl {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		TelInfoDAO tidao1 = null;
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		// 계산 및 판단 즉, business logic 은 서블릿에서 한다.
		tidao1 = new TelInfoDAO();
		tidao1.update_nametel(tel, name);
	}
}
