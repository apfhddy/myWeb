package main.tables.library.JDK_version;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JDK_version_Service {
	
	@Autowired
	private JDK_version_DAO jdk_version_DAO;
	
	public Map<String,Object> getSettings(){
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("JDK_VER", jdk_version_DAO.getversions());
		
		return returnMap; 
	}
	
	
	
	
}
