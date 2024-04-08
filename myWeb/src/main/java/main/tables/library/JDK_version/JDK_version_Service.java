package main.tables.library.JDK_version;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.tables.library.dir_type.Dir_type_DAO;
import main.tables.library.file_type.File_type_DAO;

@Service
public class JDK_version_Service {
	
	@Autowired
	private JDK_version_DAO jdk_version_DAO;
	@Autowired
	private Dir_type_DAO dir_type_DAO;
	@Autowired
	private File_type_DAO file_type_DAO;
	
	public Map<String,Object> getSettings(){
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("JDK_VER", jdk_version_DAO.getversions());
		returnMap.put("D_type", dir_type_DAO.getDirType());
		returnMap.put("F_type", file_type_DAO.getFileType());
		
		return returnMap; 
	}
	
	
	
	
}
