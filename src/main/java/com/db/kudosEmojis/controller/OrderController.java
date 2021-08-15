package com.db.kudosEmojis.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.kudosEmojis.dto.Order;
import com.db.kudosEmojis.dto.Product;
import com.db.kudosEmojis.service.OrderService;

@RestController 
@RequestMapping("/api/order")
public class OrderController {

	// i want to retrieve all empl records
	@Autowired
	private OrderService orderService;

	
	@GetMapping("/fetchAll")
	public ResponseEntity<?> fetchAll() {

		List<Order> optional = orderService.fetchAll();
		return ResponseEntity.ok(optional);

	}

	@GetMapping("/get/{userid}")
	public ResponseEntity<?> getItems(@PathVariable("userid") String userId) {

		List<Product> optional = orderService.getItems(userId);
		return ResponseEntity.ok(optional);

	}


	@PostMapping("/checkout/{userid}/{prodid}")
	public ResponseEntity<?> createOrder(@PathVariable("userid") String userid, @PathVariable("prodid") String prodid) {
		orderService.addOrder(userid,prodid);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	
	@DeleteMapping("/delete/{userid}/{prodid}")
	public ResponseEntity<?> deleteById(@PathVariable("userid") String userid, @PathVariable("prodid") String prodid) {
		
		orderService.deleteOrderById(userid, prodid);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/checkout/{userid}")
	public ResponseEntity<?> checkOutByUserId(@PathVariable("userid") String userid) {
		
		orderService.checkOutByUserId(userid);
		return ResponseEntity.ok().build();
	}
	

}