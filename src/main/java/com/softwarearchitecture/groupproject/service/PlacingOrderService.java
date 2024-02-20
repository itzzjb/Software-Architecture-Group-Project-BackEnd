package com.softwarearchitecture.groupproject.service;

import com.softwarearchitecture.groupproject.dto.PlacingOrderDto;
import com.softwarearchitecture.groupproject.entity.Order;

public interface PlacingOrderService {
    void placeOrder(PlacingOrderDto placingOrderDto);

    Order findOrder(int id);
}
