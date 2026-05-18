package org.example.kubernetes.services;

import org.example.kubernetes.models.Order;
import org.example.kubernetes.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("orderService")

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Order addOrder(@Qualifier("Order") Order order){
        Order content=orderRepository.save(order);
        return content;
    }

    public List<Order> getOrders() {
        return orderRepository.getAll();
    }
}
