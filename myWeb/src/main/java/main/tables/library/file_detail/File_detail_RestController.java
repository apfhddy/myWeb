package main.tables.library.file_detail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class File_detail_RestController {
	
	@Autowired
	private File_detail_Service file_detail_Service;
	
	@GetMapping("file/detail/{no}")
	public List<File_detail_DTO> getfileDetail(@PathVariable("no") int LB_F_no){
		
		System.out.println(LB_F_no);
		
		return null;
	}
	
	
}
