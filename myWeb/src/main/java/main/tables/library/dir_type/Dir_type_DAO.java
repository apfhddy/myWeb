package main.tables.library.dir_type;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Dir_type_DAO {
	public List<Dir_type_DTO> getDirType();
}
