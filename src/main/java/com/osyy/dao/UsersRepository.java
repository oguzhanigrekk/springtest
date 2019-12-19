package com.osyy.dao;

import java.util.List;

import com.osyy.model.Users;

public interface UsersRepository {
	
	List<Users> findAll();
	Users findById(Long id);
	List<Users> findByMail(String email);
	void create(Users user);
	Users update(Users user);
	void delete(Long id);

}
