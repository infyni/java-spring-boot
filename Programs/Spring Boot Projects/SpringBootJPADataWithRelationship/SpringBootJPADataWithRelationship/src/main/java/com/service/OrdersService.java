package com.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.orm.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
												
	public String placeOrder(Orders orders) {	// oid is auto increment,pid(PK), 
		LocalDateTime ldt = LocalDateTime.now();
		orders.setOrderdate(ldt);
		ordersRepository.save(orders);
		return "Order placed successfully";
	}
	
	public List<Orders> findAllOrders() {
		return ordersRepository.findAll();
	}
}
