package com.technohunk.dto;

import java.sql.Timestamp;

public class CustomerDTO {
	
	private int cid;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private String photo;
	private String education;
	private Timestamp createdate;
	private Timestamp updateddate;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	public Timestamp getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(Timestamp updateddate) {
		this.updateddate = updateddate;
	}
	@Override
	public String toString() {
		return "CustomerEntity [cid=" + cid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", photo=" + photo + ", education=" + education + ", createdate=" + createdate
				+ ", updateddate=" + updateddate + "]";
	}
	
	

}
