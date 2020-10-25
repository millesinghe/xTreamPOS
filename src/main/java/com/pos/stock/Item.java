package com.pos.stock;

public class Item {
	
	private String itemName = null;
	private String batchNo = null;
	private double buyPrice= 0.0;
	private String boughtFrom = null;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getBoughtFrom() {
		return boughtFrom;
	}
	public void setBoughtFrom(String boughtFrom) {
		this.boughtFrom = boughtFrom;
	}
	
	
	

}
