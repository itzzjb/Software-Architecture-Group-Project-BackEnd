package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Cart;
import com.softwarearchitecture.groupproject.entity.Category;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.entityMapper.CartEntityMapper;
import com.softwarearchitecture.groupproject.entityMapper.CategoryEntityMapper;
import com.softwarearchitecture.groupproject.entityMapper.OrderEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.OrderRepository;
import com.softwarearchitecture.groupproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = OrderEntityMapper.mapToOrder(orderDto);
        Order savedOrder = orderRepository.save(order);
        return OrderEntityMapper.mapToOrderDto(savedOrder);
    }

    @Override
    public OrderDto getOrderById(int orderId) {
        Order order =  orderRepository.findById(orderId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Order doesn't exist with the given id: " + orderId));
        return OrderEntityMapper.mapToOrderDto(order);
    }

    @Override
    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map((order) ->
                        OrderEntityMapper.mapToOrderDto(order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderDto> getAllOrders(int id) {
        return null;
    }

    @Override
    public OrderDto updateOrder(int orderId, OrderDto updatedOrderDto) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Order doesn't exist with the given id: " + orderId));

        order.setOrderId(updatedOrderDto.getOrderId());
        order.setUserId(updatedOrderDto.getUserId());
        order.setTotalQuantity(updatedOrderDto.getTotalQuantity());
        order.setTotalPrice(updatedOrderDto.getTotalPrice());
        order.setDateTime(updatedOrderDto.getDateTime());

        Order updatedOrder = orderRepository.save(order);
        return OrderEntityMapper.mapToOrderDto(updatedOrder);
    }

    @Override
    public void deleteOrder(int orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Order doesn't exist with the given id: " + orderId));

        orderRepository.deleteById(orderId);
    }

}
