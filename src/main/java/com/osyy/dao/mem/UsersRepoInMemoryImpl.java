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
	   
	   Users user2 = new Users();
	   user2.setId(2L);
	   user2.setCreateDate(localTime);
	   user2.setMail("o.o@oo.com");
	   user2.setName("oguzhan");
	   user2.setSurname("igrek");
	   user2.setUserName("oguzhanigrek");
	   
	   usersMap.put(user1.getId(), user1);
	   usersMap.put(user2.getId(), user2);
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
