package main.tables.library.library_file;

import lombok.Data;

@Data
public class Library_file_DTO {
	private int LB_F_no;
	private int LB_D_no;
	private int F_type_no;
	private int add_VER;
	private int remove_VER;
	private int isTest;
	private String name;
}
