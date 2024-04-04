package main.tables.library.library_dir;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Library_dir_DAO {
	public List<Library_dir_DTO> getDir_Flat(int ver);
}
