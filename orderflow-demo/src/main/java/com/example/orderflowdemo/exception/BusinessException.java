package com.example.orderflowdemo.exception;

import com.example.orderflowdemo.common.ErrorCode;

public class BusinessException extends RuntimeException {
    private final int code;

    public BusinessException (ErrorCode errorcode) {
        super(errorcode.getMessage());
        this.code = errorcode.getCode();
    }

    public BusinessException (int errorcode, String message) {
        super(message);
        this.code = errorcode;
    }

    public int getCode() {
        return code;
    }
}

