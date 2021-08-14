package com.db.kudosEmojis.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.db.kudosEmojis.dto.Product;


@Repository 
public interface ProductRepository extends JpaRepository<Product, String> {
	
	@Query("FROM Product where pId = ?1")
	public Product getProductById(String id);

}