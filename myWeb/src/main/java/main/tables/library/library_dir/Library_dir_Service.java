package main.tables.library.library_dir;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Library_dir_Service {
	@Autowired
	private Library_dir_DAO library_dir_DAO;
	
	public List<Library_dir_DTO> getDirs(int ver) {
		return library_dir_DAO.getDir_Flat(ver);
	}
}
