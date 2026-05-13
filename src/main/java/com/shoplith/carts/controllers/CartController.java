package com.shoplith.carts.controllers;


import com.shoplith.carts.dto.CartDto;
import com.shoplith.carts.payload.CartPayload;
import com.shoplith.carts.response.ApiResponse;
import com.shoplith.carts.services.cart.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CartController {

   private final CartService cartService;
   private CartController(CartService cartService){
       this.cartService = cartService;
   }

   @PostMapping("/cart/create")
    public ResponseEntity<ApiResponse<CartDto>> createCart(@RequestBody  CartPayload payload){
       return  ResponseEntity.status(201).body(new ApiResponse<>(201,"Cart has been created successfully", ApiResponse.Status.SUCCESS,cartService.createCart(payload)));
    }






}
