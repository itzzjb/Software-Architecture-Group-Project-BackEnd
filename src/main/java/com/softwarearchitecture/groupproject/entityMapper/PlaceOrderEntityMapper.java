package com.softwarearchitecture.groupproject.entityMapper;

import com.softwarearchitecture.groupproject.dto.PlacingOrderDto;
import com.softwarearchitecture.groupproject.entity.Order;

public class PlaceOrderEntityMapper {

    public static Order dtoToEntity(PlacingOrderDto placingOrderDto) {
        return new Order (
                placingOrderDto.getOrderId(),
                placingOrderDto.getUserId(),
                placingOrderDto.getTotalQuantity(),
                placingOrderDto.getTotalPrice(),
                placingOrderDto.getDateTime()
        );
    }
}
