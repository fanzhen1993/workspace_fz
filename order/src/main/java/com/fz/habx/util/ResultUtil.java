package com.fz.habx.util;


public class ResultUtil {

    private ResultUtil() {
    }

    public static JsonProtocol newResult(int code, String message, Object data) {
        JsonProtocol jsonProtocol= new JsonProtocol();
        jsonProtocol.setCode(code);
        jsonProtocol.setMessage(message);
        jsonProtocol.setData(data);
        return jsonProtocol;
    }
    
    public static JsonProtocol newSuccessResult() {
        JsonProtocol jsonProtocol= new JsonProtocol();
        jsonProtocol.setup(ResultCode.SUCCESS);
        return jsonProtocol;
    }

    public static JsonProtocol newSuccessResult(Object data) {
        JsonProtocol jsonProtocol= new JsonProtocol();
        jsonProtocol.setup(ResultCode.SUCCESS).setData(data);
        return jsonProtocol;
    }

    public static JsonProtocol newSuccessResult(int code, String message, Object data) {
        JsonProtocol jsonProtocol= new JsonProtocol();
        jsonProtocol.setCode(code);
        jsonProtocol.setMessage(message);
        jsonProtocol.setData(data);
        return jsonProtocol;
    }

    public static JsonProtocol newFailResult(String message) {
        JsonProtocol jsonProtocol= new JsonProtocol();
        jsonProtocol.setCode(1);
        jsonProtocol.setMessage(message);
        return jsonProtocol;
    }
    
    public static JsonProtocol newFailResult(String message, Object data) {
        JsonProtocol jsonProtocol= new JsonProtocol();
        jsonProtocol.setCode(1);
        jsonProtocol.setMessage(message);
        jsonProtocol.setData(data);
        return jsonProtocol;
    }

    public static JsonProtocol newFailResult(int code, String message, Object data) {
        JsonProtocol jsonProtocol= new JsonProtocol();
        jsonProtocol.setCode(code);
        jsonProtocol.setMessage(message);
        jsonProtocol.setData(data);
        return jsonProtocol;
    }
}
