package com.plocky.deador.repository;

import com.plocky.deador.model.Order;
import com.plocky.deador.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    public List<OrderItem> findAllByOrder(Order order);
}
