package main.tables.library.library_file;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Library_file_Service {
	@Autowired
	private Library_file_DAO library_file_DAO;
	
	public List<Library_file_DTO> getFiles(int LB_D_no){
		return library_file_DAO.getFiles(LB_D_no);
	}
}
