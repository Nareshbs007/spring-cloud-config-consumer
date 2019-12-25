package com.springboot.config.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.config.server.model.MemberProfileConfiguration;

@Controller
public class ProfileController {
	
	@Autowired
	MemberProfileConfiguration memberConfig;
	
	@RequestMapping("/profile")
	public String getConfig(Model model) {
		model.addAttribute("model", memberConfig.getDefaultModel());
		model.addAttribute("min", memberConfig.getMinRentPeriod());
		return "mprofile";
	}
	
}
