package com.growithus.service.demo.util;

public class BusinessException extends BaseException{


	private static final long serialVersionUID = 1L;
	
    public BusinessException() {
        super();
    }

    public BusinessException(String errorMsg) {
        super(errorMsg);
    }

    public BusinessException(int errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
    }


    public BusinessException(String errorMsg, Throwable cause) {
        super(errorMsg, cause);
    }

    public BusinessException(int errorCode, String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
    }


}
