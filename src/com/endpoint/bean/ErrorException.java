package com.endpoint.bean;

import com.endpoint.util.Constants;

/**
 * Error class for handling Exceptions and return info
 * */
public class ErrorException extends Exception {

	/**
	 * SerialVersionUID
	 */
	private static final long serialVersionUID = 3744591164058213877L;
	
	/**
	 * Error constant for return info
	 * */
	private String error = Constants.RESULT_ERROR;

	/**
	 * Constructor
	 * */
	public ErrorException() {
		super();
	}

	/**
	 * Constructor
	 * @param e Exception
	 * */
	public ErrorException(Exception e) {
		super(e.getLocalizedMessage());
	}

	/**
	 * Constructor
	 * @param message String
	 * */
	public ErrorException(String message) {
		super(message);
	}

	/**
	 * Get error property
	 * @return String
	 * */
	public String getError() {
		return error;
	}
	
	

}
