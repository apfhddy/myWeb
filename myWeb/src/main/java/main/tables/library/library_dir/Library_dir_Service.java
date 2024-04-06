package main.tables.library.library_dir;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.tables.library.JDK_version.JDK_version_DAO;
import main.tables.library.JDK_version.JDK_version_DTO;

@Service
public class Library_dir_Service {
	@Autowired
	private Library_dir_DAO library_dir_DAO;
	@Autowired
	private JDK_version_DAO jdk_version_DAO;
	
	public List<Library_dir_DTO> getDirs_Flat(int ver) {
		return library_dir_DAO.getDirs_Flat(ver); 
	}
	public List<Library_dir_DTO> getDirs_Tree(int ver,int parent_no) {
		Map<String,Integer> map = new HashMap<>();
		map.put("ver", ver);
		map.put("parent_no", parent_no);
		return library_dir_DAO.getDirs_Tree(map); 
	}
	
	public Map<String,Object> insertDir(Library_dir_DTO dto) {
		
		int next = library_dir_DAO.getNextSeq();
		dto.setLB_D_no(next);
		int suc =library_dir_DAO.insertDir(dto);
		
		Map<String,Object> returnMap = new HashMap<String, Object>();
		if(suc == 1) {
			int addReal_VER = jdk_version_DAO.getNotoReal_VER(dto.getAdd_VER());
			int removeReal_VER = dto.getRemove_VER() == 0 ? 0 : jdk_version_DAO.getNotoReal_VER(dto.getRemove_VER());
			
			returnMap.put("isSuccess", suc);
			returnMap.put("lb_D_no", next);
			returnMap.put("add_VER", addReal_VER);
			returnMap.put("remove_VER", removeReal_VER);
		}else {}
		
		
		return returnMap;
	}
}
