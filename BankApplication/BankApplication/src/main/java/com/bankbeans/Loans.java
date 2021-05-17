package com.bankbeans;

public class Loans {
	int lId;
	String type;
	float amount;
	public Loans(int lId, String type, float amount) {
		super();
		this.lId = lId;
		this.type = type;
		this.amount = amount;
	}
	public Loans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Loans [lId=" + lId + ", type=" + type + ", amount=" + amount + "]";
	}
	
}
