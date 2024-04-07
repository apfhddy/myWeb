package main.tables.library.JDK_version;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JDK_version_Service {
	
	@Autowired
	private JDK_version_DAO jdk_version_DAO;
	
	public List<JDK_version_DTO> getversions(){
		return jdk_version_DAO.getversions(); 
	}
	
	
	
	
}
