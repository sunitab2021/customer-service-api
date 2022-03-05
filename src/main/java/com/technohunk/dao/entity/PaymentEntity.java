package com.technohunk.dao.entity;

//import java.util.Date;

public class PaymentEntity {
	private int pid;
	private double amount;
	private String pdetail;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPdetail() {
		return pdetail;
	}
	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}
	@Override
	public String toString() {
		return "PaymentEntity [pid=" + pid + ", amount=" + amount + ", pdetail=" + pdetail + "]";
	}
	
	
}
