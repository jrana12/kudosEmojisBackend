package com.db.kudosEmojis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.kudosEmojis.dto.Order;
import com.db.kudosEmojis.dto.User;
import com.db.kudosEmojis.repository.UserRepository;


@Service
public class UserService {
	@Autowired // will perform DI ===> required object it will provide you implicitly.
	private 	UserRepository userRepository ;
	
	public List<User> fetchAll() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	
	}
	public User addUser(User employee) {
		// TODO Auto-generated method stub
		return userRepository.save(employee);
	}
	public User getUserByEmail(String userEmail) {
		// TODO Auto-generated method stub
		//return null;
		return userRepository.getUserByEmail(userEmail);
	}
}
