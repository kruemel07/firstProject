package de.simon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class StartpageController {
	
	@RequestMapping("/")
	public ModelAndView getStartPage (){
		ModelAndView mv = new ModelAndView("/welcome");
		
		return mv;
	}

}
