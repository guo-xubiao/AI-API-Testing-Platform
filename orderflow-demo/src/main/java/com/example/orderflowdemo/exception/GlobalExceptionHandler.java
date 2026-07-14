package com.example.orderflowdemo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.example.orderflowdemo.common.ApiResponse;
import com.example.orderflowdemo.common.ErrorCode;

@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(BusinessException.class)
    public ApiResponse<Void> handleBusinessException(BusinessException e) {
        return ApiResponse.fail(e.getCode(), e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ApiResponse<Void> handleException(Exception e) {
        return ApiResponse.fail(500, "Internal Server Error");
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse<Void> handleValidationException(MethodArgumentNotValidException e) {
        return ApiResponse.fail(ErrorCode.PARAM_ERROR);
    }
}
