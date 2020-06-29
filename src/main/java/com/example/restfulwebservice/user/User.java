package com.example.restfulwebservice.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"password","ssn"})
//@JsonFilter("UserInfo")
public class User {
	private Integer id;
	
	@Size(min=2, message = "Name은 두글자 이상 입력해 주세요.")
	private String name;
	@Past
	private Date joinDate;
	
	//@JsonIgnore Json화면에서 출력 시키지않음
	private String password;
	//@JsonIgnore
	private String ssn;
}
