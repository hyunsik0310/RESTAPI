package com.example.restfulwebservice.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"password","ssn"})
//@JsonFilter("UserInfo")
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
public class User {
	private Integer id;
	
	@Size(min=2, message = "Name은 두글자 이상 입력해 주세요.")
	@ApiModelProperty(notes = "사용자 이름을 입력해 주세요")
	private String name;
	@Past
	@ApiModelProperty(notes = "사용자 등록일을 입력해 주세요")
	private Date joinDate;
	
	//@JsonIgnore Json화면에서 출력 시키지않음
	@ApiModelProperty(notes = "사용자 비밀번호를 입력해 주세요")
	private String password;
	//@JsonIgnore
	@ApiModelProperty(notes = "사용자 주민번호를 입력해 주세요")
	private String ssn;
}
