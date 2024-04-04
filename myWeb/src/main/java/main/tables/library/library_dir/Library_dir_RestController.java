package main.tables.library.library_dir;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library_dir_RestController {
	@Autowired
	private Library_dir_Service library_dir_Service;
	
	@GetMapping("dirs/{ver}")
	public List<Library_dir_DTO> getDirs(@PathVariable("ver")int ver){
		
		return library_dir_Service.getDirs(ver);
	}
}
