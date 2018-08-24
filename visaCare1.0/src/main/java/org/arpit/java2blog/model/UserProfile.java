package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Customer table in database
 *  
 
 
 */
@Entity
@Table(name="AA_USER_PROFILE")
public class UserProfile {
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String userId;

	@Column(name="PERSON_ID")
	String personId; 

	@Column(name="PERSON_TYPE")
	String persionType;

	@Column(name="EMAIL_ID")
	String emailId; 

	@Column(name="PASSWORD")
	String password;
	
	@Column(name="ACCT_LOCK")
	String acctLock; 

	@Column(name="PROFILE_STATUS")
	String profileStatus;
	
	@Column(name="DESCRIPTION")
	String description; 

	@Column(name="LONG_DESCRIPTION")
	String longDescription;
	
	@Column(name="INSERTED_BY")
	String insertedBy; 

	@Column(name="INSERT_DATETIME")
	String insertedDateTime;
	
	@Column(name="UPDATED_BY")
	String updatedBy;
	@Column(name="UPDATE_DATETIME")
	String updatedDatetime;
	
	@Column(name="VCARE_UNIT")
	String vcareUnit;
	
	public UserProfile() {
		super();
	}
	public UserProfile(String userId) {
		super();
		this.userId=userId;
		 
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getPersionType() {
		return persionType;
	}
	public void setPersionType(String persionType) {
		this.persionType = persionType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAcctLock() {
		return acctLock;
	}
	public void setAcctLock(String acctLock) {
		this.acctLock = acctLock;
	}
	public String getProfileStatus() {
		return profileStatus;
	}
	public void setProfileStatus(String profileStatus) {
		this.profileStatus = profileStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getInsertedBy() {
		return insertedBy;
	}
	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}
	public String getInsertedDateTime() {
		return insertedDateTime;
	}
	public void setInsertedDateTime(String insertedDateTime) {
		this.insertedDateTime = insertedDateTime;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDatetime() {
		return updatedDatetime;
	}
	public void setUpdatedDatetime(String updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}
	public String getVcareUnit() {
		return vcareUnit;
	}
	public void setVcareUnit(String vcareUnit) {
		this.vcareUnit = vcareUnit;
	}
	 
	 
}
