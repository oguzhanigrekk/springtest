package com.osyy.dao.mem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.osyy.dao.UsersRepository;
import com.osyy.model.Users;

@Repository
public class UsersRepoInMemoryImpl implements UsersRepository {

	
	private Map<Long, Users> usersMap = new HashMap<>();
	LocalDateTime localTime = LocalDateTime.now();
	
	public UsersRepoInMemoryImpl() {

	   Users user1 = new Users();
	   user1.setId(1L);
	   user1.setCreateDate(localTime);
	   user1.setMail("o.o@o.com");
	   user1.setName("oguzhan");
	   user1.setSurname("igrek");
	   user1.setUserName("oguzhanigrek");
	   
	   usersMap.put(user1.getId(), user1);
	}
	
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Users>(usersMap.values());
	}

	@Override
	public Users findById(Long id) {
		// TODO Auto-generated method stub
		return usersMap.get(id);
	}

	@Override
	public List<Users> findByMail(String email) {
		return usersMap.values().stream().filter(o->o.getMail().equals(email)).collect(Collectors.toList());
	}

	@Override
	public void create(Users user) {
		user.setId(new Date().getTime());
		usersMap.put(user.getId(),user);

	}

	@Override
	public Users update(Users user) {
		usersMap.replace(user.getId(),user);
		return user;
	}

	@Override
	public void delete(Long id) {
		usersMap.remove(id);

	}

}
