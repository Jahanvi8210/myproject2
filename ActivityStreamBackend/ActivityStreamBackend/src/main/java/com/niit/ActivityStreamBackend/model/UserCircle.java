package com.niit.ActivityStreamBackend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;


	@Entity
	@Component
	public class UserCircle implements Serializable{

		@Id
		@GeneratedValue
		private int userCircleId;
		private String circleName;
		private String emailId;
		public UserCircle() {
			
			
		}
		
		public UserCircle(int userCircleId, String circleName, String emailId) {
			this.userCircleId = userCircleId;
			this.circleName = circleName;
			this.emailId = emailId;
			
		

	}
}
