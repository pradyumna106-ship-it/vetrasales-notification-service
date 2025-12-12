package com.notification.email.entity;
import jakarta.persistence.*;
@Entity
public class Mail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String receiver;
	String subject;
	String body;
	public Mail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mail(Long id, String receiver, String subject, String body) {
		super();
		this.id = id;
		this.receiver = receiver;
		this.subject = subject;
		this.body = body;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Mail [id=" + id + ", receiver=" + receiver + ", subject=" + subject + ", body=" + body + "]";
	}
	
	
}
