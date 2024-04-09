package main.tables.library.library_file;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library_file_RestController {
	@Autowired
	private Library_file_Service library_file_Service;
	
	
	@GetMapping("files/{ver}/{no}")
	public Map<String,Object> getFileData(@PathVariable("ver") int ver,@PathVariable("no") int LB_F_no){
		return library_file_Service.getFileData(ver,LB_F_no);
	}
	
	
	
	
	
	
	
	
	@PostMapping("/files")
	public Map<String,Object> insertFile(@RequestBody Library_file_DTO body) {
		return library_file_Service.insertFile(body);
	}
	
	@PutMapping("/files/{no}")
	public int updateFile(@RequestBody Library_file_DTO body,@PathVariable("no") int LB_F_no) {
		return library_file_Service.updateFile(body, LB_F_no); 
	}
	
	
}
