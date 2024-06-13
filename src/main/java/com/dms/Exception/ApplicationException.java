package com.dms.Exception;

import org.springframework.http.HttpStatus;

public class ApplicationException extends RuntimeException {
	private String errorCode;
	private String message;
	private HttpStatus httpStatus;

	public ApplicationException(String errorCode, String message, HttpStatus httpStatus) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
