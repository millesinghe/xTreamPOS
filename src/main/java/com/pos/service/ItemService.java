package com.pos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pos.stock.Item;

@Service
public class ItemService {

	private static List<Item> itemList = new ArrayList<Item>();
	
//	static {
//		itemList.add(new Item("101","Highland Milk - 400g",null,120.00,50.00));
//		itemList.add(new Item("102","Highland Milk - 1kg",null,220.00,20.00));
//		itemList.add(new Item("111","Anchor Milk - 400g",null,150.00,40.00));
//		itemList.add(new Item("112","Anchor Milk - 1kg",null,320.00,10.00));
//	}
	
	public List<Item> findAll() {
		return itemList;
	}

	public List<Item> findById(String id) {
		List<Item> searchItems = new ArrayList<Item>();
		for(Item item : itemList){
			if(item.getItemNo().contains(id)) {
				searchItems.add(item);
			}
		}
		return searchItems;
	}
	
}
