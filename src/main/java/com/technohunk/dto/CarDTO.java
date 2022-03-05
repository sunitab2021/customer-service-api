package com.technohunk.dto;

//import java.sql.Timestamp;

public class CarDTO {
	//private int cid;
	private int rid;
	private String make;
	private String model;
	//private Timestamp year;
	private int price;
	
	//public int getCid() {
	//	return cid;
	//}
	//public void setCid(int cid) {
	//	this.cid = cid;
	//}
	public int getRid() {
		return rid;
	}
	public void setMid(int rid) {
		this.rid = rid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarDTO [rid=" + rid + ", make=" + make + ", model=" + model + ", price=" + price
				+ "]";
	}
	
	

}
