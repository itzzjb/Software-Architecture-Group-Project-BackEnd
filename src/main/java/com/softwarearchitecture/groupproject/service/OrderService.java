package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Order;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);

    Order findOrder(int id);
}
