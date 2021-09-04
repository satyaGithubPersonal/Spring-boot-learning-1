package com.springlearning1.demo.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
//	private int code;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
//		this.code = code;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}	
	

//	public int getCode() {
//		return code;
//	}
}
