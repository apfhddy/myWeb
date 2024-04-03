package main.tables.library.JDK_version;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDK_version_RestController {
	
	@Autowired
	private JDK_version_Service jdk_version_Service;
	
	@GetMapping("versions")
	public List<JDK_version_DTO> getversions() {
		return jdk_version_Service.getversions();
	}
}
