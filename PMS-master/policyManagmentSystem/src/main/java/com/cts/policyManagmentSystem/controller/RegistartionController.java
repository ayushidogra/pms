package com.cts.policyManagmentSystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.policyManagmentSystem.bean.User;
import com.cts.policyManagmentSystem.service.RegistrationService;

@Controller
public class RegistartionController {

	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping("successful.html")
	public String getSuccessfulPage(){
		return "successful";
	}
	
	@GetMapping("registration12.html")
	public ModelAndView getRegistrationPage(@ModelAttribute User user,HttpSession httpSession){
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("Adminregister");
		System.out.println("1");
		System.out.println(user.getUserType());
		return modelAndView;
	}
	
	@GetMapping("registration13.html")
	public ModelAndView getRegistrationPageUser(@ModelAttribute User user,HttpSession httpSession, Model model){
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("Userregister");
		System.out.println("2");
		System.out.println(user.getUserType());
		return modelAndView;
	}
	
	@PostMapping("registration.html")
	public ModelAndView registerAdmin(@ModelAttribute User user,HttpSession httpSession,HttpServletRequest request)
	{
		ModelAndView modelAndView = new ModelAndView();
		/*String userType = (String) request.getAttribute("userType");
		user.setUserType(userType);*/
		
		if("true".equals(registrationService.addAdmin(user)))
		{
			System.out.println("2");
			System.out.println(user.getUserType());
			
			modelAndView.setViewName("successful");
			return modelAndView;
		}
		else
		{
			System.out.println("FAILED");
			return null;
		}
	
		
	}
	
	@PostMapping("userregistration.html")
	public ModelAndView registerUser(@ModelAttribute User user,HttpSession httpSession,HttpServletRequest request)
	{
		ModelAndView modelAndView = new ModelAndView();
		/*String userType = (String) request.getAttribute("userType");
		user.setUserType(userType);*/
		
		if("true".equals(registrationService.addUser(user)))
		{
			System.out.println("2");
			System.out.println(user.getUserType());
			
			modelAndView.setViewName("successful");
			return modelAndView;
		}
		else
		{
			System.out.println("FAILED");
			return null;
		}
	
		
	}
}
