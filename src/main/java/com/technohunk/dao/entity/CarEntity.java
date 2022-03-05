package com.technohunk.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_tbl")
public class CarEntity {
	private int rid;
	private String make;
	private String model;
	private int price;
	
	private CustomerEntity customerEntity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id")
	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}
	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Column(length = 15)
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Column(length = 15)
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Column(length = 15)
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarEntity [mid=" + rid + ", make=" + make + ", model=" + model + ", price=" + price
				+ "]";
	}
	
	

}
