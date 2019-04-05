package com.cts.policyManagmentSystem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.policyManagmentSystem.bean.Policy;
import com.cts.policyManagmentSystem.bean.User;
import com.cts.policyManagmentSystem.service.PolicyService;

@Controller
public class AdminController {

	@Autowired
	PolicyService policyService;
	
	@RequestMapping("successfulEdit.html")
	public String getSuccessfulEditPage(){
		return "successfulEdit";
	}
	
	@GetMapping("adminHome.html")
	public ModelAndView getAdminHome(HttpSession httpSession){
		ModelAndView modelAndView= new ModelAndView();
		System.out.println("hi from");
		List<Policy> policies = policyService.getAllPolicy();
		modelAndView.addObject("policies", policies);
		System.out.println(policies);
		modelAndView.setViewName("adminHome1");
		return modelAndView;
	}
	
	@RequestMapping("addPolicy.html")
	public ModelAndView getPolicyPage(HttpSession httpSession){
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("addPolicy");
		return modelAndView;
	}
	
	
	@PostMapping("addPolicy.html")
	public ModelAndView addPolicy(@ModelAttribute Policy policy,HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		if("true".equals(policyService.addPolicy(policy)))
		{
			//System.out.println(policy);
			modelAndView.setViewName("adminHome1");
			return modelAndView;
		}
		else
		{
			System.out.println("FAILED");
			return null;
		}
	}
	
	@RequestMapping(value="viewPolicy.html")
	public ModelAndView getViewProduct(@RequestParam("id") String id,HttpSession httpSession){
		ModelAndView mav = new ModelAndView();
		Policy policy= policyService.getPolicyById(id);
		mav.addObject("policy",policy);
		mav.setViewName("viewPolicy");
		
		return mav;
	}
	
	@RequestMapping(value="editPolicy.html")
	public ModelAndView getEditPolicyInfo(@RequestParam("id") String id,HttpSession httpSession){
		ModelAndView mav = new ModelAndView();
		Policy policy= policyService.getPolicyById(id);
		System.out.println(policy);
		mav.addObject("display",policy);
		mav.setViewName("editPolicy");
		return mav;
	}
	
	@PostMapping(value="editPolicy.html")
	public ModelAndView putEditPolicy(@ModelAttribute Policy policy,HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(policy);
		if("true".equals(policyService.updatePolicy(policy)))
		{
			//System.out.println(policy);
			modelAndView.setViewName("successfulEdit");
			return modelAndView;
			
		}
		else
		{
			System.out.println("FAILED");
			return null;
		}
	}
	
	@GetMapping("logout.html")
	public ModelAndView exitProduct(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		httpSession.invalidate();
		
		modelAndView.setViewName("Userlogin");
		return modelAndView;
	}
	@RequestMapping(value="policy1.html")
	public ModelAndView policy(@ModelAttribute Policy policy,@RequestParam("id") String userId, HttpSession httpSession)
	{
		ModelAndView modelAndView= new ModelAndView();
		List<Policy> policies = policyService.getAllPolicy();
		modelAndView.addObject("products", policies);
		modelAndView.setViewName("adminHome1");
		return modelAndView;
	}
}
