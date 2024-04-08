package main.tables.library.JDK_version;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDK_version_RestController {
	
	@Autowired
	private JDK_version_Service jdk_version_Service;
	
	
	@GetMapping("settings")
	public Map<String,Object> getSettings() {
		
		return jdk_version_Service.getSettings();
	}
}
