package main.tables.library.library_dir;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Library_dir_DAO {
	public List<Library_dir_DTO> getDirs_Flat(int ver); 
	public List<Library_dir_DTO> getDirs_Tree(int parent_no);
	public int getNextSeq();
	public int insertDir(Library_dir_DTO dto);
	public int deleteDir(int LB_D_no);
	public int updateDir(Library_dir_DTO dto);
}
