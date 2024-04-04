package main;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	public MainController() {
		System.out.println("hi");
	}
	@RequestMapping("/")
	public String index(HttpServletRequest req) {
		String hidden = req.getParameter("hidden");
		if(hidden != null && hidden.equals("lethal"))
			return "html/lethal.html";
		
		return "index.html";
	}
	
	@RequestMapping("api-certified")
	@ResponseBody
	public int check_key(@RequestBody Map<String,String> body) {
		
		
		return 0;
	}
}
