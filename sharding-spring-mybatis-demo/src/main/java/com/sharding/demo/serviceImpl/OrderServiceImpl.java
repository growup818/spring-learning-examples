package com.sharding.demo.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sharding.demo.bean.Order;
import com.sharding.demo.dao.OrderRepository;
import com.sharding.demo.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderRepository orderRepository;

	@Override
	public long insert(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.insert(order);
	}

}
