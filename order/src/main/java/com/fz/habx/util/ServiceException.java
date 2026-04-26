package com.fz.habx.util;

public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private int serviceCode;

	public ServiceException(int serviceCode) {
		super(null, null, false, false);
		this.serviceCode = serviceCode;
	}

	public ServiceException(int serviceCode, String message) {
		super(message, null, false, false);
		this.serviceCode = serviceCode;
	}
	
	public ServiceException(ResultCode resultCode) {
		super(resultCode.getMessage(), null, false, false);
		this.serviceCode = resultCode.getCode();
	}
	
	public int getServiceCode() {
		return serviceCode;
	}
	
	
}
