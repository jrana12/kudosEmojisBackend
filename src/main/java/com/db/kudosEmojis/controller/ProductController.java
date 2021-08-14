package com.db.kudosEmojis.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.kudosEmojis.dto.Product;
import com.db.kudosEmojis.dto.User;
import com.db.kudosEmojis.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	// i want to retrieve all empl records
	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<?> getAllProducts() {

		List<Product> products = productService.getProducts();

		return ResponseEntity.status(HttpStatus.OK).body(products);
		// spring boot rest will transfrom ur objects Stringo JSON objects.
		// if we are sending only one object then it will send the single json object
		// if we sending collection/array then it will send it in terms of json array.

	}

	
}