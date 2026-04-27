package com.shoplith.carts.exceptions;

public class CartAlreadyExistException extends  RuntimeException {

    public CartAlreadyExistException(String message){
        super(message);
    }

}
