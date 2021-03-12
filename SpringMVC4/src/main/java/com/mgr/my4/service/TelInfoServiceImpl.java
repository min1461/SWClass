package com.mgr.my4.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TelInfoDAO;
import vo.TelInfoVO;

//@Repository - business logic 상세작업 
@Service
public class TelInfoServiceImpl implements TelinfoService {
	// jsp servlet에서 heava() execute()...
	// 즉 @controller나 dao의 내용을 service가 맡아
	// business logic차원에서 확장성있는 작업을 하게함
	// 이때 인터페이스 형식은 확장성과 유연성르 갖게함

	// @Autowired
	// property,생성자 ref를 대신사용하여 자동 DI
	// 그러므로 setter constructor문장을 생략하게 만드는것

	@Autowired
	private TelInfoDAO telinfoDAO; // telinfoDAO를 스프링에 등록
	// bean객체에서 ref로 객체 인자전달한 것과 같은 효과

	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		return telinfoDAO.getAllTelinfo(vo1);
	}

	public TelInfoVO getTelInfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		return telinfoDAO.getTelinfo(vo1);
	}

	public void updateTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		telinfoDAO.updateTelinfo(vo1);
	}

	public void insertTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		telinfoDAO.insertTelinfo(vo1);
	}

	public void deleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		telinfoDAO.deleteTelinfo(vo1);

	}
}