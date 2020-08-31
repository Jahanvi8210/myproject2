package com.niit.ActivityStreamBackend.model;
import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
public class WorkspaceUsers implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int workspaceUsersId;
	private String companyName;
	private String userEmailId;
	private char status;
  
	public WorkspaceUsers() {
		
	}
	public WorkspaceUsers(int workspaceUserId, String companyName, String userEmailId, char status) {
		super();
		this.workspaceUsersId = workspaceUserId;
		this.companyName = companyName;
		this.userEmailId = userEmailId;
		this.status = status;
	}

	public int getWorkspaceUserId() {
		return workspaceUsersId;
	}

	public void setWorkspaceUserId(int workspaceUserId) {
		this.workspaceUsersId = workspaceUserId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
    
    
    


}

