package com.sharma.nk.utils;

public class ValidationException extends Exception {

	private static final long serialVersionUID = -8572632056455229581L;
	private String reason;
	
	public ValidationException(){}
	
	/**
	 * @param ValidationException : reason
	 */
	public ValidationException(String reason){
		this.reason=reason;
	}

	
	
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "ValidationException [reason=" + reason + "]";
	}
}
