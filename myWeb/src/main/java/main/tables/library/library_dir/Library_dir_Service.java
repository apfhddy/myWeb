package main.tables.library.library_dir;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.tables.library.library_file.Library_file_DAO;

@Service
public class Library_dir_Service {
	@Autowired
	private Library_dir_DAO library_dir_DAO;
	@Autowired
	private Library_file_DAO library_file_DAO;
	
	public List<Library_dir_DTO> getDirs_Flat(int ver) {
		return library_dir_DAO.getDirs_Flat(ver); 
	}
	public Map<String,Object> getDirs_Tree(int parent_no) {
		Map<String,Object> returnMap = new HashMap<String, Object>();
		returnMap.put("dirs", library_dir_DAO.getDirs_Tree(parent_no));
		returnMap.put("files", library_file_DAO.getFiles(parent_no));
		return returnMap; 
	}
	
	public Map<String,Object> insertDir(Library_dir_DTO dto) {
		
		int next = library_dir_DAO.getNextSeq();
		dto.setLB_D_no(next);
		int suc =library_dir_DAO.insertDir(dto);
		
		Map<String,Object> returnMap = new HashMap<String, Object>();
		if(suc == 1) {
			returnMap.put("isSuccess", suc);
			returnMap.put("lb_D_no", next);
		}else {}
		return returnMap;
	}
	
	
	
	public int deleteDir(int LB_D_no) {
		return library_dir_DAO.deleteDir(LB_D_no);
	}
	
	public int updateDir(Library_dir_DTO dto,int LB_D_no) {
		dto.setLB_D_no(LB_D_no);
		return library_dir_DAO.updateDir(dto);
	}
}
