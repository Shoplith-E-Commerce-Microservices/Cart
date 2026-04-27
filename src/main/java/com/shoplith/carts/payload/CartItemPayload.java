package com.shoplith.carts.payload;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CartItemPayload {

    private UUID cart_id;
    private UUID item_id;
    private int quantity;
    private double priceAddedAt;
    

}
