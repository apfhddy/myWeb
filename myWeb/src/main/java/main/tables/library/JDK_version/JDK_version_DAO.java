package main.tables.library.JDK_version;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JDK_version_DAO {
	
	public List<JDK_version_DTO> getversions();

}
