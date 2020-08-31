package com.niit.ActivityStreamBackend.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


	@Entity
	@Component
	public class Circle implements Serializable{

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int circleId;
		@Column(name="circleName")
		private String circleName;
		@Column(name="createdBy")
		private String createdBy;
		private boolean status;
		@Column(name="creationDate")
		@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
		private Date creationDate;
		
		public int getCircleId() {
			return circleId;
		}
		public void setCircleId(int circleId) {
			this.circleId=circleId;
		}
		
		
		public Circle() {
			this.creationDate=new Date(circleId);
		}
		public String getCircleName() {
			return circleName;
		}
		public void setCircleName(String circleName) {
			this.circleName = circleName;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public boolean isStatus() {
			return status;
		} 
		public void setStatus(boolean status) {
			this.status = status;
		}
		public Date getCreationDate() {
			return creationDate;
		}
		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}
		
		
		
		//constructor method

		//getter and setter methods
	}



