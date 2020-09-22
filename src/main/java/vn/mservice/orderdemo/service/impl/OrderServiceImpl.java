package vn.mservice.orderdemo.service.impl;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import vn.mservice.orderdemo.domain.model.Order;
import vn.mservice.orderdemo.domain.repository.OrderRepository;
import vn.mservice.orderdemo.dto.OrderDTO;
import vn.mservice.orderdemo.service.OrderService;

import java.util.Objects;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order getOrderById(Long id) throws Exception {
        Optional<Order> optOrder = this.orderRepository.findById(id);
        if (!optOrder.isPresent()) {
            throw new Exception("Order not found");
        }
        return optOrder.get();
    }

    @Override
    public Order createOrder(Order orderDTO) {
        Order order = this.orderRepository.save(Order.packingNewOrder(orderDTO));
        return order;
    }
}
