package com.example.demo.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto {
private int id;
@NotEmpty
@Size(min=4, message=" username must be 4 charaters !!")
private String name;
@Email( message=" email address is not valid!!")
private String email;
@NotEmpty
@Size(min=3, max=8, message=" password must be min of 3 chars and max of 4 chars !!")
//@Pattern(regexp = )
private String password;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
