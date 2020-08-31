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
public class Workspace implements Serializable{

	
	@Id
	@GeneratedValue
	private int WorkspaceId;
	private String purpose;
	private String typeOfOrganization;
	private String role;
	private String companyName;
	private String emailId;
	@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
	private Date creationDate;
	public Workspace(int workspaceId, String purpose, String typeOfOrganiszation, String role, String companyName,
			String emailId, Date creationDate) {
		
		WorkspaceId = workspaceId;
		this.purpose = purpose;
		this.typeOfOrganization = typeOfOrganiszation;
		this.role = role;
		this.companyName = companyName;
		this.emailId = emailId;
		this.creationDate = creationDate;
	}
	public int getWorkspaceId() {
		return WorkspaceId;
	}
	public void setWorkspaceId(int workspaceId) {
		this.WorkspaceId = WorkspaceId;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getTypeOfOrganisation() {
		return typeOfOrganization;
	}
	public void setTypeOfOrganisation(String typeOfOrganisation) {
		this.typeOfOrganization = typeOfOrganization;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getemailId() {
		return emailId;
	}
	public void setAdminEmailId(String adminEmailId) {
		this.emailId= emailId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
    
    
}

	
	
