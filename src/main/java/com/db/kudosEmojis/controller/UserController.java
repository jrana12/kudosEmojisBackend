package com.db.kudosEmojis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.kudosEmojis.dto.Order;
import com.db.kudosEmojis.dto.User;
import com.db.kudosEmojis.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/fetchAll")
	public ResponseEntity<?> fetchAll() {

		List<User> optional = userService.fetchAll();
		return ResponseEntity.ok(optional);

	}
	@PostMapping("/updateUser")
	public ResponseEntity<?> createEmployee(@RequestBody User user){
		userService.addUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	@GetMapping("/userlogin/{email}")
	public ResponseEntity<?> getUserByEmail(@PathVariable("email") String userEmail) {

		User result =  userService.getUserByEmail(userEmail);

		return ResponseEntity.ok(result);
	}
}
