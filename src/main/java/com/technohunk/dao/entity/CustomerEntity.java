package com.technohunk.dao.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.rab3tech.dao.entity.ActorsEntity;

@Entity
@Table(name="customer_tbl2")
public class CustomerEntity {
	private int cid;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private String photo;
	private String education;
	private Timestamp createdate;
	private Timestamp updateddate;
	
	private List<CarEntity> carEntity;
	
	@OneToMany(mappedBy = "customerEntity", cascade = {
			CascadeType.ALL
	})
	public List<CarEntity> getCarEntity() {
		return carEntity;
	}
	public void setCarEntity(List<CarEntity> carEntity) {
		this.carEntity = carEntity;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Column(length = 50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length = 120)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length = 15)
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Column(length = 10)
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
