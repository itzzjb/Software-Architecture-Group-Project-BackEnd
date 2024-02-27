package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.entityMapper.OrderEntityMapper;
import com.softwarearchitecture.groupproject.repository.OrderRepository;
import com.softwarearchitecture.groupproject.service.PlacingOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacingOrderServiceImpl implements PlacingOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    public PlacingOrderServiceImpl (OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void placeOrder(OrderDto orderDto) {
        Order order = OrderEntityMapper.dtoToEntity(orderDto);
        orderRepository.save(order);
    }

    @Override
    public Order findOrder(int id) {
        Order order =  orderRepository.findById(id);
        return order;
    }


}
