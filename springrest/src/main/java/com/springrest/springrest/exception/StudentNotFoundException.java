package com.springrest.springrest.exception;

import org.springframework.http.HttpStatus;

public class StudentNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final ErrorEnum error;

	private final HttpStatus httpStatus;

	public ErrorEnum getError() {
		return error;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public StudentNotFoundException(ErrorEnum error, HttpStatus httpStatus) {
		this.error = error;
		this.httpStatus = httpStatus;
	}
}
