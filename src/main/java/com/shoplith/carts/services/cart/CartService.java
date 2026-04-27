package com.shoplith.carts.services.cart;

import com.shoplith.carts.dto.CartDto;
import com.shoplith.carts.payload.CartPayload;


public interface CartService {


    public CartDto createCart(CartPayload payload);


}
