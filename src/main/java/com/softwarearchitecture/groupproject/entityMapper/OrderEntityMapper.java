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

    public static OrderDto mapToOrderDto(Order order) {
        return new OrderDto(
                order.getOrderId(),
                order.getUserId(),
                order.getTotalQuantity(),
                order.getTotalPrice(),
                order.getDateTime()
        );
    }

}
