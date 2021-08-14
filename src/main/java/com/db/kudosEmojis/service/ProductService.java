package com.db.kudosEmojis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.kudosEmojis.dto.Product;
import com.db.kudosEmojis.dto.User;
import com.db.kudosEmojis.repository.ProductRepository;



@Service
public class ProductService{


	@Autowired // will perform DI ===> required object it will provide you implicitly.
	private 	ProductRepository productRepository ;
	
	public void addProduct(Product prod) {
		productRepository.save(prod);
	}
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}
	

}