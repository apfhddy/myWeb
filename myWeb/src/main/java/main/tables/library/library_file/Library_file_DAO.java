package main.tables.library.library_file;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Library_file_DAO {
	
	public List<Library_file_DTO> getFiles(int LB_D_no);
}