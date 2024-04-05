package main.tables.library.library_dir;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Library_dir_Service {
	@Autowired
	private Library_dir_DAO library_dir_DAO;
	
	public List<Library_dir_DTO> getDirs_Flat(int ver) {
		return library_dir_DAO.getDirs_Flat(ver); 
	}
	public List<Library_dir_DTO> getDirs_Tree(int ver,int parent_no) {
		Map<String,Integer> map = new HashMap<>();
		map.put("ver", ver);
		map.put("parent_no", parent_no);
		return library_dir_DAO.getDirs_Tree(map); 
	}
}
