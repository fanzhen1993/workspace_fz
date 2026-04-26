package com.fz.habx.util;


public class JsonProtocol {
    private int code;
    private String message;
    private Object data;

    public JsonProtocol setup(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        return this;
    }

    public JsonProtocol setup(ResultCode resultCode, Object data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
        return this;
    }

    public JsonProtocol setup(int result, Object data) {
        this.code = result;
        this.data = data;
        return this;
    }

    public JsonProtocol setupAsException(Throwable e) {
        this.code = ResultCode.SERVER_ERROR.getCode();
        this.message = e.getMessage();
        return this;
    }

    public JsonProtocol setupAsServiceException(ServiceException e) {
        this.code = e.getServiceCode();
        this.message = e.getMessage();
        return this;
    }


    public long getTimestamp() {
        return System.currentTimeMillis();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}

