package com.osyy.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.osyy.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/userss")
	public ModelAndView getUsers() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users", usersService.findUsers());
		mav.setViewName("userss");
		System.out.println(usersService.findUsers()+"+++++++++++++++++++++");
		return mav;
	}
	

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "welcome";
	}
	
}
