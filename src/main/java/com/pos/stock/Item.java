package com.pos.stock;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Item {
	
	@Id
	@Column(length=30)
	private String itemNo;
	private String itemName;
	
	@OneToMany(mappedBy="item")
	private List<PurchaseItem> itemList;
	
	private double sellPrice= 0.0;
	private double cummulativeAmount = 0.0;
	
	protected Item() {
		
	}
	
	public Item(String itemNo, String itemName, double sellPrice, double cummulativeAmount) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.sellPrice = sellPrice;
		this.cummulativeAmount = cummulativeAmount;
	}
	
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public List<PurchaseItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<PurchaseItem> itemList) {
		this.itemList = itemList;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public double getCummulativeAmount() {
		return cummulativeAmount;
	}
	public void setCummulativeAmount(double cummulativeAmount) {
		this.cummulativeAmount = cummulativeAmount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	

}
