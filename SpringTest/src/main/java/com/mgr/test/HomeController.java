package com.mgr.test;

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

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/getAllScoreinfo.do", method = RequestMethod.POST)
	public String score(Model model, HttpServletRequest req) {
		String irum = req.getParameter("irum");
		String scoreS = req.getParameter("score");
		if (irum != null && scoreS != null && Integer.parseInt(scoreS) <= 100) {
			int score = Integer.parseInt(scoreS);
			switch (score / 10) {
			case 10:
			case 9:
				return "Akaja";
			case 8:
				return "Bkaja";
			case 7:
				return "Ckaja";
			case 6:
				return "Dkaja";

			default:
				return "Fkaja";
			}
		}
		return "error";

	}
}
