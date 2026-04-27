package com.shoplith.carts.exceptions;

public class CartNotFoundException extends RuntimeException {

    public CartNotFoundException(String message){
        super(message);
    }


}
