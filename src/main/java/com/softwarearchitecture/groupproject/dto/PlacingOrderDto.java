package com.softwarearchitecture.groupproject.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PlacingOrderDto {

    private int orderId;

    private int userId;

    private int totalQuantity;

    private int totalPrice;

    private String dateTime;
}
