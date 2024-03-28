package com.example.demo.tables.lethal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class LethalController {

	@GetMapping("/hidden/download")
	public void getFile(@RequestParam(name="fileName") String file,HttpServletResponse res) throws IOException {
		File f = new File("src/main/resources/static/hidden/dir/"+file);
		System.out.println(file); 
		res.setContentType("application/download");
		res.setContentLength((int)f.length());
		res.setHeader("Content-disposition", "attachment;filename=\"" + file + "\"");
        
		System.out.println(f);
		OutputStream os = res.getOutputStream();
        
		FileInputStream fis = new FileInputStream(f);
        FileCopyUtils.copy(fis, os);
        fis.close();
        os.close();
	}
}
