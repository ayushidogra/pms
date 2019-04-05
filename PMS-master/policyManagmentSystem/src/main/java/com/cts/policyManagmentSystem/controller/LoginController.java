package com.cts.policyManagmentSystem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.policyManagmentSystem.bean.Policy;
import com.cts.policyManagmentSystem.bean.User;
import com.cts.policyManagmentSystem.service.LoginService;
import com.cts.policyManagmentSystem.service.PolicyService;



@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping("login.html")
	public String getLoginPage(){
		return "login";
	}
	
	@RequestMapping("userlog.html")
	public String getLoginPage1(){
		return "Userlogin";
	}
	
	
	@RequestMapping("adminlog.html")
	public String getLoginPage2(){
		return "Adminlogin";
	}
	
	
	@RequestMapping("login1.html")
	public String getLoginPageUser(){
		return "login1";
	}
	
	@Autowired
	PolicyService policyService;
	
	/*@RequestMapping("registration.html")
	public String getRegistrationPage(){
		return "registration";
	}*/
	
	@RequestMapping("index.html")
	public String getIndexPage(){
		return "index";
	}
	
	/*@RequestMapping("Admin-ListProducts.html")
	public String getPage(){
		return "Admin-ListProducts";
	}*/
	
	@RequestMapping("adminHome.html")
	public String getPage(){
		return "adminHome";
	}
	
	
	
	// hyperlinks get
	// submission post
	
	
	@PostMapping("login.html")
	public ModelAndView validateAdmin(@ModelAttribute User user,HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(user.toString());
		User user2 = loginService.authenticate(user.getUserId(), user.getPassword());
		if(loginService.authenticate(user.getUserId(),user.getPassword()) != null)
		{
			/*if("100".equals(user2.getUserId()) && "admin".equals(user2.getPassword()))
			{
				//httpSession.setAttribute("user", user2);
				//	System.out.println("hiiiiiiiiiiii");
					//	System.out.println(user2);
					modelAndView.addObject("user", user2);
					List<Policy> policies = policyService.getAllPolicy();
					//modelAndView.addObject("products", policies);
					modelAndView.addObject("policies", policies);
						//modelAndView.setViewName("Admin-ListProducts");
					modelAndView.setViewName("adminHome");
			}
			else
			{
				modelAndView.addObject("user", user2);
				List<Policy> policies = policyService.getAllPolicy();
				modelAndView.addObject("products", policies);
				modelAndView.setViewName("userHome");
			}*/
			
			if("A".equals(user2.getUserType()))
			{
				//httpSession.setAttribute("user", user2);
				//	System.out.println("hiiiiiiiiiiii");
					//	System.out.println(user2);
					modelAndView.addObject("user", user2);
					httpSession.setAttribute("user", user2);
					List<Policy> policies = policyService.getAllPolicy();
					//modelAndView.addObject("products", policies);
					modelAndView.addObject("products", policies);
						//modelAndView.setViewName("Admin-ListProducts");
					modelAndView.setViewName("adminHome1");
			}
			
			if("U".equals(user2.getUserType()))
			{
//				modelAndView.addObject("user", user2);
//				List<Policy> policies = policyService.getAllPolicy();
//				modelAndView.addObject("products", policies);
//				modelAndView.setViewName("userHome");
				System.out.println("you are user");
				modelAndView.setViewName("Adminlogin");
			}
				
				
		}
		else 
		{
			System.out.println("fail");
		}
		return modelAndView;
		
	}
	
	@PostMapping("loginuser.html")
	public ModelAndView validateUser(@ModelAttribute User user,@RequestParam("id") String userId,HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(user.toString());
		User user2 = loginService.authenticate(user.getUserId(), user.getPassword());
		if(loginService.authenticate(user.getUserId(),user.getPassword()) != null)
		{
			/*if("100".equals(user2.getUserId()) && "admin".equals(user2.getPassword()))
			{
				//httpSession.setAttribute("user", user2);
				//	System.out.println("hiiiiiiiiiiii");
					//	System.out.println(user2);
					modelAndView.addObject("user", user2);
					List<Policy> policies = policyService.getAllPolicy();
					//modelAndView.addObject("products", policies);
					modelAndView.addObject("policies", policies);
						//modelAndView.setViewName("Admin-ListProducts");
					modelAndView.setViewName("adminHome");
			}
			else
			{
				modelAndView.addObject("user", user2);
				List<Policy> policies = policyService.getAllPolicy();
				modelAndView.addObject("products", policies);
				modelAndView.setViewName("userHome");
			}*/
			
			if("A".equals(user2.getUserType()))
			{
//				//httpSession.setAttribute("user", user2);
//				//	System.out.println("hiiiiiiiiiiii");
//					//	System.out.println(user2);
//					modelAndView.addObject("user", user2);
//					List<Policy> policies = policyService.getAllPolicy();
//					//modelAndView.addObject("products", policies);
//					modelAndView.addObject("policies", policies);
//						//modelAndView.setViewName("Admin-ListProducts");
//					modelAndView.setViewName("adminHome");
				
				System.out.println("You are admin");
				modelAndView.setViewName("Userlogin");
			}
			
			if("U".equals(user2.getUserType()))
			{
				modelAndView.addObject("user", user2);
				httpSession.setAttribute("user", user2);
				List<Policy> policies = policyService.getAllPolicyForUser(userId);
				modelAndView.addObject("products", policies);
				modelAndView.setViewName("userHome");
				
			}
				
				
		}
		else 
		{
			System.out.println("fail");
		}
		return modelAndView;
		
	}
	
}
