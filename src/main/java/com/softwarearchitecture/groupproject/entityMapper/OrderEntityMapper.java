package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.OrderDto;
import com.softwarearchitecture.groupproject.entity.Order;

public class OrderEntityMapper {

    public static Order dtoToEntity(OrderDto orderDto) {
        return new Order (
                orderDto.getOrderId(),
                orderDto.getUserId(),
                orderDto.getTotalQuantity(),
                orderDto.getTotalPrice(),
                orderDto.getDateTime()
        );
    }
}
