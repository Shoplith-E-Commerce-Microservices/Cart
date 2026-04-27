package com.shoplith.carts.dto;

import com.shoplith.carts.models.Cart;
import com.shoplith.carts.response.ItemResponse;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class CartItemDto {

    private UUID id;
    private ItemResponse itemResponse;
    private int quantity;
    private double priceAddedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Cart cart;


}
