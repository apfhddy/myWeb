package main.tables.library.library_file;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.tables.library.file_detail.File_detail_DAO;

@Service
public class Library_file_Service {
	@Autowired
	private Library_file_DAO library_file_DAO;
	@Autowired
	private File_detail_DAO file_detail_DAO;
	
	public Map<String,Object> getFileData(int VER,int LB_F_no) {
		Map<String,Object> parameter = new HashMap<String, Object>();
		parameter.put("VER", VER);
		parameter.put("LB_F_no", LB_F_no);
		
		
		Map<String,Object> returnMap = new HashMap<String, Object>();
		returnMap.putIfAbsent("file_DTO",library_file_DAO.getFile(LB_F_no));
		System.out.println(file_detail_DAO.getSameVERDetail(parameter));
		
		return returnMap;
	}
	
	
	public List<Library_file_DTO> getFiles(int LB_D_no){
		return library_file_DAO.getFiles(LB_D_no);
	}
	
	public Map<String,Object> insertFile(Library_file_DTO dto){
		
		int next = library_file_DAO.getNextSeq();
		dto.setLB_F_no(next);
	 	int suc = library_file_DAO.insertFile(dto);
	 	
	 	Map<String,Object> returnMap = new HashMap<>();
	 	if(suc == 1) {
	 		returnMap.put("isSuccess", suc);
	 		returnMap.put("lb_F_no", next);
	 	}
	 	
		return returnMap;
	}
	
	public int updateFile(Library_file_DTO dto, int LB_F_no) {
		dto.setLB_F_no(LB_F_no);
		return library_file_DAO.updateFile(dto);
	}
}
