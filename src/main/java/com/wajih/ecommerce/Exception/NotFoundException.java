package com.wajih.ecommerce.Exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NotFoundException1 extends RuntimeException{
    public NotFoundException1(String message){
        super(message);
    }

}
