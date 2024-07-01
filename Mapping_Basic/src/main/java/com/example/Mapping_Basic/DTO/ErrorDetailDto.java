package com.example.Mapping_Basic.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorDetailDto {

    private int statusCode;
    private LocalDateTime timeStamp;
    private String errorMessage;
    private String status;

}

