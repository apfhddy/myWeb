package main.tables.library.file_type;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface File_type_DAO {
	public List<File_type_DTO> getFileType();
}
