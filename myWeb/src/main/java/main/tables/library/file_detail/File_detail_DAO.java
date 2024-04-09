package main.tables.library.file_detail;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface File_detail_DAO {
	
	public File_detail_DTO getSameVERDetail(Map<String,Object> parameter);
}
