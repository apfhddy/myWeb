package main.tables.library.library_dir;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Library_dir_DAO {
	public List<Library_dir_DTO> getDirs_Flat(int ver); 
	public List<Library_dir_DTO> getDirs_Tree(Map<String,Integer> map);
	public int getNextSeq();
	public int insertDir(Library_dir_DTO dto);
}
