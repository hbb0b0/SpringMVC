package com.maven01.dto;

public class UserDto {
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int id;
	public UserDto(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public UserDto()
	{
		
	}
}
