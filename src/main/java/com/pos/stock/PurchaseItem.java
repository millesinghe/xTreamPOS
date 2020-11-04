package com.pos.stock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class PurchaseItem {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
    @JoinColumn(name="item_id",nullable = false)
	@JsonBackReference
    private Item item;
	
	public Item getItem() {
		return item;
	}

	public void setItemNo(Item itemNo) {
		this.item = itemNo;
	}
	private String batchNo = null;
	private double buyPrice= 0.0;
	private String boughtFrom = null;
	private double amount = 0.0;

	protected PurchaseItem() {
		
	}
	
	public PurchaseItem(String batchNo, double buyPrice, String boughtFrom, double amount, Item item) {
		super();
		this.batchNo = batchNo;
		this.buyPrice = buyPrice;
		this.boughtFrom = boughtFrom;
		this.amount = amount;
		this.item = item;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
