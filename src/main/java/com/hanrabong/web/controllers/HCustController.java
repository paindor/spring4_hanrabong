package com.hanrabong.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanrabong.web.domains.HCustDTO;
import com.hanrabong.web.seviceImpls.HCustServiceImpl;

@Controller
@RequestMapping("/hcust/*")
public class HCustController {
	
	private static final Logger logger = LoggerFactory.getLogger(HCustController.class);
	@Autowired HCustServiceImpl empService;
	
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> login(@RequestBody HCustDTO hcust) {
		
		//logger.info("ajax 가 보낸아이디 와 비번 {}" , hcust.getCid() + ","+ hcust.getCpw());
		HashMap<String, String> map = new HashMap<>();
		
		map.put("cid",hcust.getCid() );
		map.put("cpw",hcust.getCpw());
		
		
		logger.info("map의 아이디 비번{}" , map.get("cid") + "," + map.get("cpw"));
		
		//int count = empService.countEmp();
		
		//model.addAttribute("count" , count);
		
		return map;
		
		
	}
	

}
