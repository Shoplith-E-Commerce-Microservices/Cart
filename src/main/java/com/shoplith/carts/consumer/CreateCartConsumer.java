package com.shoplith.carts.consumer;


import com.shoplith.carts.dto.CartDto;
import com.shoplith.carts.events.CartCreateEvent;
import com.shoplith.carts.models.Cart;
import com.shoplith.carts.payload.CartPayload;
import com.shoplith.carts.repositories.CartRepository;
import com.shoplith.carts.services.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CreateCartConsumer {

    private final CartService cartService;
    private final CartRepository cartRepository;

    @KafkaListener(topics = "user-cart-registration",groupId = "cart-group")
    public void createCartConsume(CartCreateEvent event){
        CartPayload payload = new CartPayload();
        payload.setUser_id(UUID.fromString(event.userId()));
        Cart cart = new Cart();
        cart.setCartItems(null);
        cart.setUser_id(payload.getUser_id());
        cartRepository.save(cart);

    }



}
