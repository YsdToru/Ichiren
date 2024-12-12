package com.example.demo.form;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserForm {

	private String user_id;
	private String user_name;
	private String user_pass;
	private String school_id;
	private LocalDate enr_year;
	private String user_flg;

}
