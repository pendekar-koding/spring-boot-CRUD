package com.example.crud.springbootcrud.common.response;

public class CustomReturn<T> {
	private String message;
	private String exception;
	private Exception detail;
	private String status;
	private T datas;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public Exception getDetail() {
		return detail;
	}

	public void setDetail(Exception detail) {
		this.detail = detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public T getDatas() {
		return datas;
	}

	public void setDatas(T datas) {
		this.datas = datas;
	}

	public CustomReturn(String message, String exception, Exception detail, String status, T datas) {
		this.message = message;
		this.exception = exception;
		this.detail = detail;
		this.status = status;
		this.datas = datas;
	}

	public CustomReturn() {
	}

}
