package main;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import main.tables.library.redis.RedisService;

@Controller
public class MainController {
	@Autowired
	RedisService redisService;
	
	@RequestMapping("/")
	public String index(HttpServletRequest req) {
		
		String ip = req.getHeader("X-FORWARDED-FOR"); 
        
        //proxy 환경일 경우
        if (ip == null || ip.length() == 0) {
            ip = req.getHeader("Proxy-Client-IP");
        }

        //웹로직 서버일 경우
        if (ip == null || ip.length() == 0) {
            ip = req.getHeader("WL-Proxy-Client-IP");
        }

        if (ip == null || ip.length() == 0) {
            ip = req.getRemoteAddr() ;
        }
		System.out.println(ip);
		
		
		
		
		String hidden = req.getParameter("hidden");
		if(hidden != null && hidden.equals("lethal"))
			return "html/lethal.html";
		
		return "index.html";
	}
	
	@RequestMapping("api-certified")
	@ResponseBody
	public boolean check_key(@RequestBody Map<String,String> body) {
		
		String key = body.get("key");
		
		boolean isPermission = redisService.getRedisTemplateValue(key) != null;
		
		
		return isPermission;
	}
}
