package com.db.kudosEmojis;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.db.kudosEmojis.dto.Product;
import com.db.kudosEmojis.dto.User;
import com.db.kudosEmojis.service.OrderService;
import com.db.kudosEmojis.service.ProductService;
import com.db.kudosEmojis.service.UserService;

@SpringBootApplication
public class KudosEmojisBackendApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(KudosEmojisBackendApplication.class, args);
	
		UserService userService = 
				applicationContext.getBean(UserService.class);
		
		ProductService productService = 
				applicationContext.getBean(ProductService.class);
		
		OrderService orderService = 
				applicationContext.getBean(OrderService.class);
		
		
		System.out.println("Hello");
		
		//Product prod = new Product("p006","p006",13,"","prod6_desc");
		//productService.addProduct(prod);
//		List<Product> currentProducts = productService.getProducts();
//		System.out.println(currentProducts);
//		
		//List<Product>pList = orderService.getItems("u002","cart");
	//	System.out.println(pList);
	}

}
