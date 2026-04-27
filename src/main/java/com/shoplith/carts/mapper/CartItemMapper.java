package com.shoplith.carts.mapper;

import com.shoplith.carts.dto.CartItemDto;
import com.shoplith.carts.models.CartItems;
import com.shoplith.carts.response.ItemResponse;

public class CartItemMapper {

    public static CartItemDto cartToCartItemDto(CartItems cartItem, ItemResponse itemResponse){
        CartItemDto dto = new CartItemDto();
        dto.setCart(cartItem.getCart());
        dto.setId(cartItem.getId());
        dto.setItemResponse(itemResponse);
        dto.setQuantity(cartItem.getQuantity());
        dto.setPriceAddedAt(cartItem.getPriceAddedAt());
        dto.setCreatedAt(cartItem.getCreatedAt());
        dto.setUpdatedAt(cartItem.getUpdatedAt());
        return dto;
    }
}
