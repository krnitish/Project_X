package com.projectx.entity;

public class HttpStatusMessage {

	private String statusText;
	public HttpStatusMessage() {
		// TODO Auto-generated constructor stub
	}
	public HttpStatusMessage(String statusText) {
		super();
		this.statusText = statusText;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	@Override
	public String toString() {
		return "HttpStatusMessage [statusText=" + statusText + "]";
	}
	
	
}
