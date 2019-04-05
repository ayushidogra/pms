package com.cts.policyManagmentSystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.policyManagmentSystem.bean.Policy;
import com.cts.policyManagmentSystem.bean.UserPolicy;
import com.cts.policyManagmentSystem.service.PolicyService;
import com.cts.policyManagmentSystem.service.UserService;

@Controller
public class UserController {
static public List<Policy> li= new ArrayList<Policy>(); 
	@Autowired
	UserService userService;
	
	@Autowired
	PolicyService policyService;
	
	
	@RequestMapping(value="viewPolicyByUser.html")
	public ModelAndView getViewPolicy(@RequestParam("id") String id,HttpSession httpSession){
		ModelAndView mav = new ModelAndView();
		Policy policy= policyService.getPolicyById(id);
		mav.addObject("policy",policy);
		mav.setViewName("viewPolicyByUser");
		
		return mav;
	}
	
	
	@GetMapping("userHome.html")
	
	public ModelAndView getUserHome(HttpSession httpSession){
		ModelAndView modelAndView= new ModelAndView();
		System.out.println("hi from");
		List<Policy> policies = policyService.getAllPolicy();
		modelAndView.addObject("products", policies);
		System.out.println(policies);
		modelAndView.setViewName("userHome");
		return modelAndView;
	}
	
	@RequestMapping(value="addtocart.html")
	public ModelAndView addToCart(@ModelAttribute UserPolicy userPolicy, @RequestParam("id") String policyId,@RequestParam("id1") String userId, HttpSession httpSession, HttpServletRequest request)
	{
		ModelAndView modelAndView= new ModelAndView();
		System.out.println(policyId);
		System.out.println(userId);
		List<String> status=policyService.getPolicyStatus(userId,policyId);
		System.out.println("in cccccc" + status);
		modelAndView.addObject("id", policyId);
		modelAndView.addObject("id1", userId);
		System.out.println("In addtocart" + policyId + userId);
if("Pending".equals(status.get(0)))
{
		
//			System.out.println("2");
//			System.out.println(user.getUserType());
			
			modelAndView.setViewName("paymentPage");
			return modelAndView;
		
}
else
{
	JOptionPane.showMessageDialog(null, "Already Paid");
	List<Policy> policies=policyService.allPolicy(userId);
	modelAndView.addObject("products", policies);
	modelAndView.setViewName("userpolicy");
	return modelAndView;
}
	}
	
	
	@RequestMapping(value="addtocart1.html")
	public ModelAndView addToCart1(@ModelAttribute UserPolicy userPolicy, @RequestParam("id") String policyId,@RequestParam("id1") String userId, HttpSession httpSession, HttpServletRequest request)
	{
		ModelAndView modelAndView= new ModelAndView();
		System.out.println(policyId);
		System.out.println(userId);
		System.out.println("In addtocart1" + policyId + userId);
		modelAndView.addObject("id", policyId);
		modelAndView.addObject("id1", userId);
		if("true".equals(userService.addPolicy(userPolicy,policyId, userId)))
		{
//			System.out.println("2");
//			System.out.println(user.getUserType());
			
			modelAndView.setViewName("paymentPage");
			return modelAndView;
		}
		else
		{
			System.out.println("FAILED");
			return null;
			
		}
}

	
	/*@RequestMapping(value="sortingByPolicyType")
	public ModelAndView getByPolicyType(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Policy> products = userService.getPolicyByType();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("userHome");
		return modelAndView;
	}
	
	@RequestMapping(value="sortingByPolicyId")
	public ModelAndView getByPolicyId(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Policy> products = userService.getPolicyById();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("userHome");
		return modelAndView;
	}
	
	@RequestMapping(value="sortingByNumberOfYears")
	public ModelAndView getByNumberOfYears(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Policy> products = userService.getPolicyByYears();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("userHome");
		return modelAndView;
	}
	
	@RequestMapping(value="sortingByCompanyName")
	public ModelAndView getByCompanyName(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Policy> products = userService.getPolicyByCompany();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("userHome");
		return modelAndView;
	}
	
	@RequestMapping(value="sortingByPolicyName")
	public ModelAndView getByPolicyName(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Policy> products = userService.getPolicyByName();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("userHome");
		return modelAndView;
	}*/
	
	
	@RequestMapping(value="policy.html")
	public ModelAndView policy(@ModelAttribute Policy policy,@RequestParam("id") String userId, HttpSession httpSession)
	{
		ModelAndView modelAndView= new ModelAndView();
		List<Policy> policies = policyService.getAllPolicyForUser(userId);
		modelAndView.addObject("products", policies);
		modelAndView.setViewName("userHome");
		return modelAndView;
	}
	
	
	@RequestMapping(value="search.html", method= RequestMethod.POST)
	public ModelAndView searchMedicine(@ModelAttribute Policy policy,@RequestParam("id") String userId, @RequestParam("selectby") String search_by,@RequestParam("search") String search_value, HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(search_by);
		System.out.println(search_value);
			List<Policy> policies= policyService.searchPolicyByValues(userId, search_by, search_value);
			modelAndView.addObject("products", policies);
			modelAndView.setViewName("userHome");
			return modelAndView;
	
	}
	
	@RequestMapping(value="userShowPolicy.html")
	public ModelAndView policy(@RequestParam("id") String userId, HttpSession httpSession)
	{
		ModelAndView modelAndView= new ModelAndView();
		List<Policy> policies=policyService.allPolicy(userId);
		
		modelAndView.addObject("products", policies);
		modelAndView.setViewName("userpolicy");
		return modelAndView;
	}
	
	@RequestMapping(value="remove.html")
	public ModelAndView remove(@RequestParam("id") String policyId, @RequestParam("id1") String userId,  HttpSession httpSession)
	{
		ModelAndView modelAndView= new ModelAndView();
		System.out.println(userId + policyId);
		String a=policyService.removePolicy(policyId,userId);
			List<Policy> policies=policyService.allPolicy(userId);
			modelAndView.addObject("products", policies);
			modelAndView.setViewName("userpolicy");
			return modelAndView;
		
		
	}
	@PostMapping(value="paymentGateway.html")
	public ModelAndView cart(HttpSession httpSession,@RequestParam("id") String policyId, @RequestParam("id1") String userId)
	{
		System.out.println("in cccccccccccccccccccccccccccc"+ policyId + userId);
		//String policyId = (String)httpSession.getAttribute("id");
		
		//System.out.println("In user controller"+policyId);
		ModelAndView modelAndView= new ModelAndView();
		Policy policies=policyService.getPolicyById(policyId);
		modelAndView.addObject("policy", policies);
		boolean a=policyService.updatePolicyStatus(policyId,userId);
		modelAndView.setViewName("paymentSuccess");
		return modelAndView;
	}
}
