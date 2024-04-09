package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.dao.LoginDao;
import com.springmvc.model.LoginModel;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDao Id;
	
	@RequestMapping(value="beflog.obj",method=RequestMethod.GET)
	public String show(Model model){
		model.addAttribute("ver",new LoginModel());
		return "login";
		}

	
	@RequestMapping(value="beflog.obj",method=RequestMethod.POST)
	public String verify(@ModelAttribute("ver") @Validated LoginModel login, BindingResult result,Model model) {
		if(result.hasErrors()) {
		
		return "login";
		}
		
		if(Id.validator(login)) {
		return "home";
		}else {
			model.addAttribute("msg","UserName or password is incorrect");
			return "login";
		}
	}
}


