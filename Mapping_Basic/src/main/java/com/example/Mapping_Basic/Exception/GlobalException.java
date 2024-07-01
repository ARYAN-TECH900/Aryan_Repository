package com.example.Mapping_Basic.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException st){
        List<String> fieldError= st.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        Map<String,Object> errorMap= new HashMap<>();
        errorMap.put("status", HttpStatus.BAD_REQUEST.name());
        errorMap.put("statusCode",HttpStatus.BAD_REQUEST.value());
        errorMap.put("timeStamp", LocalDateTime.now());
        errorMap.put("errorMessage",fieldError);
        return new ResponseEntity<>(errorMap,HttpStatus.BAD_REQUEST);
    }
}
