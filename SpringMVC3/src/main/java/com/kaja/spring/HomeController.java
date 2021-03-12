package com.kaja.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="moyamoya.do",method=RequestMethod.POST)
	public String kaja(@RequestParam(value="irum",defaultValue="")String irumResult, Model model) {
						//HttpServletrquest 로 해도됨 ! 
		
		//String irum =req.getParameter("irum");
		if(irumResult.equals("")||irumResult==null) {
			return "kajaError";
			//넘어오는 irum이 없으면 false가 들어가면서 kajaError.jsp파일로 간다 
		}
		model.addAttribute("mirum",irumResult);
			return "kaja";
			// 들어오는 이름이 있을 경우 kaja.jsp로 
	}
	
}
