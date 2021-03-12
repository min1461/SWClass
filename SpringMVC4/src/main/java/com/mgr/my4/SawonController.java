package com.mgr.my4;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.my4.service.TelinfoService;

import vo.TelInfoVO;

@Controller
public class SawonController {
	// @Resource는 type이 아닌 이름을 딱 정해서 스프링에 등록
	// @Autowired //type 으로 찾아서 처리
	@Resource(name="TelInfoService")//@Autowired = @Resource(이름)
				//Service("TelInfoService)에서 씀
	private TelinfoService telInfoService;
	//<form action="getAllTelinfo.do"등의 이름요청이 들어오면 지금 얘한테 온다
	
	@RequestMapping("/getAllTelinfo.do")
	//@RequestMapping
	//이때 Model 객체 model1은 view 로 전달시 컨트롤러가 생성한 data를 담을 그릇 객체
	public String sawonGetAllTelinfo(TelInfoVO vo1, Model model1) throws ClassNotFoundException, SQLException{
		model1.addAttribute("mAllTelinfo",telInfoService.getAllTelinfo(vo1));
		//return "sawonGetAllTelinfo.jsp"; // view경로
		return "sawonGetAllTelinfo";
	}
}
