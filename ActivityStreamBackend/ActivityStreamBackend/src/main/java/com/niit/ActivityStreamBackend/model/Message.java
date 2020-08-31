package com.niit.ActivityStreamBackend.model;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity

@Component


public class Message implements Serializable{

	@Id
	@GeneratedValue
	private int messageId;
	private String messageText;
	private String senderEmailId;
	@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
	private Date sentDate;
	private long messageSize;
	private long maximumSize;
	private String messageType;
	private String receiverEmailId;
	private String circleName;
	
	public Message() {
		
	}
	
	//constructor method
	//getter and setter methods
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	public String getSenderEmailId() {
		return senderEmailId;
	}
	public void setSenderEmailId(String senderEmailId) {
		this.senderEmailId = senderEmailId;
	}
	public Date getSentDate() {
		return sentDate;
	}
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
	public long getMaximumSize() {
		return maximumSize;
	}
	public void setMaximumSize(long maximumSize) {
		this.maximumSize = maximumSize;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getReceiverEmailId() {
		return receiverEmailId;
	}
	public void setReceiverEmailId(String receiverEmailId) {
		this.receiverEmailId = receiverEmailId;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public boolean sendMessage(Message message) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getMyMessages(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
