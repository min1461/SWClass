package com.frontcontroller.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface excuteImpl {
	public void excute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
