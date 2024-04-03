package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	public MainController() {
		System.out.println("main");
	}
	@RequestMapping("/")
	public String index(HttpServletRequest req) {
		String hidden = req.getParameter("hidden");
		if(hidden != null && hidden.equals("lethal"))
			return "html/lethal.html";
		
		return "index.html";
	}
}
