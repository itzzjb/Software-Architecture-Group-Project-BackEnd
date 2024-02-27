package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.entityMapper.OrderEntityMapper;
import com.softwarearchitecture.groupproject.exception.ResourceNotFoundException;
import com.softwarearchitecture.groupproject.repository.OrderRepository;
import com.softwarearchitecture.groupproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public OrderDto getOrderById(int id) {
        Order order =  orderRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Order doesn't exist with the given id: " + id));
        return OrderEntityMapper.mapToOrderDto(order);
    }


}
