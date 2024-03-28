package com.example.demo.tables.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(HttpServletRequest req) {
		String hidden = req.getParameter("hidden");
		if(hidden != null && hidden.equals("lethal"))
			return "html/lethal.html";
		
		return "html/index.html";
	}
}
