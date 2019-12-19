package com.osyy.service;

import java.util.List;

import com.osyy.exception.UserNotFoundException;
import com.osyy.model.Users;

public interface UsersService {
	
	List<Users> findUsers();
	List<Users> findByMail(String email);
	Users findOwner(Long id) throws UserNotFoundException;
    void createUser(Users users);
    void updateUsers(Users users);
    void deleteUsers(Long id);
}
