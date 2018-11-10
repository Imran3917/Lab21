package com.CoffeShop.lab21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index", "firstPage", "Welcome to my Coffee Shop");
	//ModelAndView mv = new ModelAndView("index", "firstpage", "Welcome to my Coffee Shop");
		
	return mv;
	}
	
	@RequestMapping("/register")
    public ModelAndView registerTest() {
        return new ModelAndView("register");
    }
    
    @RequestMapping("formresults")
    public ModelAndView formTest(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lname, @RequestParam("email") String email, @RequestParam("phonenumber") long phnumber, @RequestParam("password") String pword) {
        return new ModelAndView("formPage", "fname", firstname);
    
	}

}
