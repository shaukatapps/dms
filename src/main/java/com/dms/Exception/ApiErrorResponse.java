package com.dms.Exception;

import java.time.LocalDateTime;

public class ApiErrorResponse {
	private String guid;
	private String errorCode;
	private String message;
	private Integer statusCode;
	private String statusName;
	private String path;
	private String method;
	private LocalDateTime timestamp;
	
	public ApiErrorResponse(String guid, String errorCode, String message, Integer statusCode, String statusName,
			String path, String method, LocalDateTime timestamp) {
		super();
		this.guid = guid;
		this.errorCode = errorCode;
		this.message = message;
		this.statusCode = statusCode;
		this.statusName = statusName;
		this.path = path;
		this.method = method;
		this.timestamp = timestamp;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}