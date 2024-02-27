package com.softwarearchitecture.groupproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDto {

    private int orderId;

    private int userId;

    private int totalQuantity;

    private int totalPrice;

    private String dateTime;

}
