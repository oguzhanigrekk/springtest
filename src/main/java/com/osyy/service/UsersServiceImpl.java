package com.osyy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osyy.dao.UsersRepository;
import com.osyy.exception.UserNotFoundException;
import com.osyy.model.Users;

@Service
public class UsersServiceImpl implements UsersService {

	private UsersRepository userRepository;
	
	@Autowired
	public void setUserRepository(UsersRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public List<Users> findUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}


	@Override
	public List<Users> findByMail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByMail(email);
	}


	@Override
	public Users findOwner(Long id) throws UserNotFoundException {
		Users user = userRepository.findById(id);
		if(user == null) throw new UserNotFoundException("user not found 0"+ id);
		return user;
	}

	@Override
	public void createUser(Users users) {
		userRepository.create(users);

	}

	@Override
	public void updateUsers(Users users) {
		userRepository.update(users);

	}

	@Override
	public void deleteUsers(Long id) {
		userRepository.delete(id);

	}

	

}
