package de.simon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartpageController {
	
	@RequestMapping("/login.html")
	public ModelAndView getStartPage (){
		ModelAndView mv = new ModelAndView("login");
		
		
		return mv;
	}
	
	@RequestMapping("/welcome")
	public ModelAndView getHomepage(){
		return new ModelAndView("welcome");
	}

}
