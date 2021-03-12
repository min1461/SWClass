package com.mgr.my4.service;

import java.sql.SQLException;
import java.util.ArrayList;

import vo.TelInfoVO;

public interface TelinfoService {
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	public TelInfoVO getTelInfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	public void updateTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	public void insertTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	public void deleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
}
