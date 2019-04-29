package com.hackerrank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hackerrank.beans.HackerRank;
import com.hackerrank.service.CountingValleysService;

@Controller
public class HackerRankController {
	
//	@GetMapping("/hackerrank")
//	public String hackerRankForm(Model model) {
//		model.addAttribute("hackerrank", new HackerRank());
//		return "hackerrank";
//	}
//	
//	@PostMapping("/hackerrank")
//    public String hackerRankSubmit(@ModelAttribute HackerRank hackerRank) {
//        return "countingvalleys";
//    }
	
//	@Autowired
//	private CountingValleysService countingValleysService;
//
//	@RequestMapping("/countingvalleys")
//	public String runCountingVallets() {
//		return countingValleysService.run();
//	}
	

	
	
}
