package com.hanrabong.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanrabong.web.seviceImpls.HCustServiceImpl;

@Controller
@RequestMapping("/hcust/*")
public class HCustController {
	
	private static final Logger logger = LoggerFactory.getLogger(HCustController.class);
	@Autowired HCustServiceImpl empService;
	
	@GetMapping("/count")
	public String count(Model model) {
		//int count = empService.countEmp();
		
		//model.addAttribute("count" , count);
		
		return "index";
		
		
	}
	

}
