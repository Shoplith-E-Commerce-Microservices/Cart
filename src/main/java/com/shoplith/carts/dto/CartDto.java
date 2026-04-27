package com.shoplith.carts.dto;

import com.shoplith.carts.response.ItemResponse;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
public class CartDto {


    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private ItemResponse items;

}
