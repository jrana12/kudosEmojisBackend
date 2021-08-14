package com.db.kudosEmojis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.db.kudosEmojis.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{

	@Query("FROM User WHERE userEmail=?1")
	public User getUserByEmail(String userEmail);

}
