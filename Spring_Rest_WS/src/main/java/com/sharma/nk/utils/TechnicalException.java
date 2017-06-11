package com.sharma.nk.utils;

/**
 * All technical exceptions like Database Exceptions - connectivity 
 * @author Heavens<br/> 
 * @since: Feb 5, 2017
 */
public class TechnicalException extends Exception {

	private static final long serialVersionUID = 7286519594142591241L;
	private String reason;
	
	public TechnicalException(){}
	/**
	 * @param reason : reason for TechnicalException
	 */
	public TechnicalException(String reason){
		this.reason=reason;
	}
	public TechnicalException(Exception ex){
		this.reason=ex.getMessage();
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "TechnicalException [reason=" + reason + "]";
	}
}
