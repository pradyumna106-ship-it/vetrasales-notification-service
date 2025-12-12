package com.notification.email.dto;

public class Smsdto {
	private String phoneNo;
	private String content;
	public Smsdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Smsdto(String phoneNo, String content) {
		super();
		this.phoneNo = phoneNo;
		this.content = content;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Smsdto [phoneNo=" + phoneNo + ", content=" + content + "]";
	}
	
	
}
