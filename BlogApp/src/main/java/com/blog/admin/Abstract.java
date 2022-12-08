package com.blog.admin;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class Abstract {

	private String name;
	private String email;
	private String mobile;
	private String password;
	
}
