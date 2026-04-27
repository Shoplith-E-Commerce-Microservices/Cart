package com.shoplith.carts.mapper;


import com.shoplith.carts.dto.CartDto;
import com.shoplith.carts.models.Cart;
import com.shoplith.carts.models.CartItems;

public class CartMapper {


    public static CartDto cartToCartDto(Cart cart){
        CartDto dto = new CartDto();
        dto.setId(cart.getId());
        dto.setUpdatedAt(cart.getUpdatedAt());
        dto.setCreatedAt(cart.getCreatedAt());
        return dto;
    }




}
