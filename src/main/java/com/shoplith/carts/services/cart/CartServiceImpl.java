package com.shoplith.carts.services.cart;

import com.shoplith.carts.dto.CartDto;
import com.shoplith.carts.exceptions.CartAlreadyExistException;
import com.shoplith.carts.mapper.CartMapper;
import com.shoplith.carts.models.Cart;
import com.shoplith.carts.payload.CartPayload;
import com.shoplith.carts.repositories.CartRepository;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {

  private final CartRepository cartRepository;

  public CartServiceImpl(CartRepository cartRepository){
      this.cartRepository = cartRepository;
  }
    public CartDto createCart(CartPayload payload){
      if(cartRepository.findByUserId(payload.getUser_id()).isPresent()){
          throw new CartAlreadyExistException("Cart already exist belongs to this user id " + payload.getUser_id());
      }

        Cart newCart = new Cart();
        newCart.setUser_id(payload.getUser_id());
        newCart.setCartItems(null);
        return CartMapper.cartToCartDto(cartRepository.save(newCart));

    }

}
