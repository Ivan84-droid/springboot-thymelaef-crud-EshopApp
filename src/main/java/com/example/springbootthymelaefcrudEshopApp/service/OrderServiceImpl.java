package com.example.springbootthymelaefcrudEshopApp.service;
import com.example.springbootthymelaefcrudEshopApp.model.Order;
import com.example.springbootthymelaefcrudEshopApp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    public OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}


