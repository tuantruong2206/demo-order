package vn.mservice.orderdemo.service;


import vn.mservice.orderdemo.domain.model.Order;

public interface OrderService {

    public Order getOrderById(Long id) throws Exception;
    public Order createOrder(Order orderDTO);

}
