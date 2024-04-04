package main.tables.library.library_dir;

import lombok.Data;

@Data
public class Library_dir_DTO {
	private int LB_D_no;
	private int D_type_no;
	private int add_VER;
	private int remove_VER;
	private int parent_no;
	private String name;
}
