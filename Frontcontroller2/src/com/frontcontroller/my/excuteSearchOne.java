package com.frontcontroller.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class excuteSearchOne implements excuteImpl {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		TelInfoDAO tidao1 = null;
		TelInfoVO tivo1 = null;
		String name = request.getParameter("name");

		tidao1 = new TelInfoDAO();
		tivo1 = tidao1.getInfo(name);
		request.setAttribute("sname", name);
		request.setAttribute("tivo1", tivo1);

	}
}
