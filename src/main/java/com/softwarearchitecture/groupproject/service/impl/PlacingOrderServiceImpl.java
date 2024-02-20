package com.softwarearchitecture.groupproject.service.impl;

import com.softwarearchitecture.groupproject.dto.PlacingOrderDto;
import com.softwarearchitecture.groupproject.entity.Order;
import com.softwarearchitecture.groupproject.entityMapper.PlaceOrderEntityMapper;
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
    public void placeOrder(PlacingOrderDto placingOrderDto) {
        Order order = PlaceOrderEntityMapper.dtoToEntity(placingOrderDto);
        orderRepository.save(order);
    }


}
