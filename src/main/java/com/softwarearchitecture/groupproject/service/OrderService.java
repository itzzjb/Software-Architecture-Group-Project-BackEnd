package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Order;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);
    OrderDto getOrderById(int orderId);
    List<OrderDto> getAllOrders();
    List<OrderDto> getAllOrders(int id);
    OrderDto updateOrder(int orderId, OrderDto updatedOrderDto);
    void deleteOrder(int orderId);

}
