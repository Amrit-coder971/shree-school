package com.example.demo;


public class ValidationError {
	
	private boolean hasError = false;
	private String msg;
	
	public ValidationError(String errormessage) {
		this.msg = errormessage;
		this.hasError = true;
	}
	public ValidationError() {
		
	}
	public boolean isHasError() {
		return hasError;
	}
	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
