package com.blog.service;

import java.util.List;

import com.blog.exception.UserException;
import com.blog.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto updateUser(Integer userId , UserDto user) throws UserException;
	UserDto getUserById(Integer userId) throws UserException;
	List<UserDto> getAllUsers();
	List<UserDto> paginationgetAllUsers(int pageSize, int pageNumber);
	List<UserDto> paginationSortgetAllUsers(int pageSize, int pageNumber);

	void deleteUser(Integer userId) throws UserException;
}
