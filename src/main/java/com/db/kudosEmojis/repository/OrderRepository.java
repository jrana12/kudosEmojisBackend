package com.db.kudosEmojis.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.db.kudosEmojis.dto.Order;
import com.db.kudosEmojis.dto.Product;
import com.db.kudosEmojis.dto.User;


@Repository  // repository work ===> jpa data 
public interface OrderRepository extends JpaRepository<Order, String> {
// select * from empTable where empFirstName = firstName;
	
	@Query("FROM Order WHERE userId=?1")
	public List<Order> getItems(String userid);
	
	
	@Query("FROM Order WHERE userId=?1 AND prodId=?2")
	public Order getOrderToDelete(String uid, String pid);
	
	
	
	
}