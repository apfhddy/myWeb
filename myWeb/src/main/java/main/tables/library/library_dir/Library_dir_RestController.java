package main.tables.library.library_dir;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library_dir_RestController {
	@Autowired
	private Library_dir_Service library_dir_Service;
	
	
	@GetMapping("dirs/{ver}")
	public List<Library_dir_DTO> getDir_Flat(@PathVariable("ver")int ver){
		return library_dir_Service.getDirs_Flat(ver);
	}
	
	@GetMapping("dirs/{ver}/{no}")
	public List<Library_dir_DTO> getDirs_Tree(@PathVariable("ver") int ver,@PathVariable("no")  int parent_no) {
		
		return library_dir_Service.getDirs_Tree(ver, parent_no);
	}
	
	@PostMapping("dirs")
	public Map<String,Object> insertDir(@RequestBody Library_dir_DTO body) {
		return library_dir_Service.insertDir(body);
	}
	
	@DeleteMapping("dirs/{no}")
	public int deleteDir(@PathVariable("no")  int LB_D_no) {
		return library_dir_Service.deleteDir(LB_D_no);
	}
}
