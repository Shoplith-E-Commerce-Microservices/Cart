package com.shoplith.carts.hanlder;

import com.shoplith.carts.exceptions.CartAlreadyExistException;
import com.shoplith.carts.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler
    public ResponseEntity<ApiResponse<String>> cartAlreadyExistHandler(CartAlreadyExistException e){
        return ResponseEntity.status(409).body(new ApiResponse<String>(409,e.getMessage(), ApiResponse.Status.ERROR));
    }

}
