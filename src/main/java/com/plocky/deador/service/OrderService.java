package com.plocky.deador.service;

import com.plocky.deador.model.Order;
import com.plocky.deador.repository.OrderItemRepository;
import com.plocky.deador.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    OrderRepository orderRepository;
    OrderItemRepository orderItemRepository;
    ProductService productService;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

}
