package com.kaja.my;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
   
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
   
   /**
    * Simply selects the home view to render by returning its name.
    */
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {
      logger.info("Welcome home! The client locale is {}.", locale);
      
      Date date = new Date();
      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
      
      String formattedDate = dateFormat.format(date);
      
      model.addAttribute("serverTime", formattedDate );
      
      return "home";
      
   }
   @RequestMapping(value="/moya.do", method=RequestMethod.POST)
   public String kaja(Model model, HttpServletRequest req) {
                  //보내는것(기본)    /넘어오는걸 받는인자 
      String irum =req.getParameter("irum");
      model.addAttribute("mirum",irum);
      return "kaja"; //kaja(.jsp) 이므로 반환형이 String 이여야함 / 갈때 mirum을 가져감 
                  // ㄴ views 밑에 있어야햠 
   }//메소드 -end
}//class-end