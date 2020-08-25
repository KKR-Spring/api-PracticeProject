package com.littlehelpbykr.kr.users;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timstamp;
	private String message;
	private String details;
	public ExceptionResponse(Date timstamp, String message, String details) {
		super();
		this.timstamp = timstamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimstamp() {
		return timstamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}

}
