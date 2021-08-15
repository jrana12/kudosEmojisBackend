package com.db.kudosEmojis.service;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.kudosEmojis.dto.Order;
import com.db.kudosEmojis.dto.Product;
import com.db.kudosEmojis.repository.OrderRepository;
import com.db.kudosEmojis.repository.ProductRepository;


@Service
public class OrderService {


	@Autowired // will perform DI ===> required object it will provide you implicitly.
	private 	OrderRepository orderRepository ;
	@Autowired
	private ProductRepository productRepository;
	
	public List<Order> fetchAll() {
		// TODO Auto-generated method stub
		return this.orderRepository.findAll();
	}
	
	public Order addOrder(String userid, String prodid) {
		// TODO Auto-generated method stub
		Order order = new Order(userid+prodid,prodid,userid,"","");
		return orderRepository.save(order);
	}

	// Change to product
	public List<Product> getItems(String userid) {
		// TODO Auto-generated method stub
		
		List<Order> orderList =   orderRepository.getItems(userid);
		
		List<Product> productList = new ArrayList<Product>();
		
		ListIterator<Order> iterator = orderList.listIterator();
		//System.out.println(orderList);
		while(iterator.hasNext())
		{
			Order o = iterator.next();
		//	System.out.println("here" + o.getProdId());
			Product p = productRepository.getProductById(o.getProdId());
			productList.add(p);
			//System.out.println("there");
		}
		return productList;
		
	}


	public void deleteOrderById(String uid, String pid) {
		// TODO Auto-generated method stub
		Order order = orderRepository.getOrderToDelete(uid,pid);
		orderRepository.deleteById(order.getOrderId());
	}

	public void checkOutByUserId(String userid) {
		// TODO Auto-generated method stub
		
		List<Order> orderList =   orderRepository.getItems(userid);
		ListIterator<Order> iterator = orderList.listIterator();
		//System.out.println(orderList);
		while(iterator.hasNext())
		{
			Order o = iterator.next();
			o.setStatus("order");
			orderRepository.save(o);
		}
		
	}

	
}