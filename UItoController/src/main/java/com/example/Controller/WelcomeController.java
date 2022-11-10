package com.example.Controller;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@GetMapping("/Welcome")
	public String WelcomeMsg(Model model) {
		
		String msg="Hii Welcome to BikkadIT";
		System.out.println(msg);
		model.addAttribute("MSG" ,msg);
		return "welcome";
	
		
	}

}
