package com.sconti.tiendita.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	private final String ADMIN_URL = "admin";
	private final String HOME_URL = "home";
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> requestParam){
		ModelAndView mva;
		String nombre = requestParam.get("usuarioTxt");
		String password = requestParam.get("passwordTxt");
		
		if(nombre == null || nombre.equals("") || password == null || password.equals("")){
			mva = new ModelAndView(HOME_URL);
		}else{
			mva = new ModelAndView(ADMIN_URL);	
		}
		return mva;
	}
	
}
