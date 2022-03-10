package com.plocky.deador.repository;

import com.plocky.deador.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findAllByEmail(String userEmail);

}
