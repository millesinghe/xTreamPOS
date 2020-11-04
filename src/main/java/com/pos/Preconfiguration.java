package com.pos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pos.repository.ItemRepository;
import com.pos.repository.PurchaseItemRepository;
import com.pos.stock.Item;
import com.pos.stock.PurchaseItem;

@Component
public class Preconfiguration implements CommandLineRunner {

	@Autowired
	ItemRepository itemRepo;
	
	@Autowired
	PurchaseItemRepository puchaseRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
//		this.executeDB();
	}

	private void executeDB() {

		Item i1 = new Item("101", "Highland Milk - 400g", 120.00, 50.00);
		Item i2 = new Item("102", "Highland Milk - 1kg", 220.00, 20.00);
		Item i3 = new Item("111", "Anchor Milk - 400g", 150.00, 40.00);
		Item i4 = new Item("112", "Anchor Milk - 1kg", 320.00, 10.00);
				
		itemRepo.save(i1);
		itemRepo.save(i2);
		itemRepo.save(i3);
		itemRepo.save(i4);	
		
		PurchaseItem pi1 = new PurchaseItem("111101001", 100.5, "Highland Factory", 20.0, i1);
		PurchaseItem pi2 = new PurchaseItem("111101002", 101.0, "Highland Factory", 20.0, i1);
		PurchaseItem pi3 = new PurchaseItem("111101003", 110.5, "Highland Factory", 10.0, i1);
		PurchaseItem pi4 = new PurchaseItem("111101004", 100.5, "Highland Factory", 20.0, i2);
		PurchaseItem pi5 = new PurchaseItem("111101005", 100.5, "Anchor Factory", 40.00,i3);
		PurchaseItem pi6 = new PurchaseItem("111101005", 100.5, "Anchor Factory", 10.0,i4);
		
		puchaseRepo.save(pi1);
		puchaseRepo.save(pi2);
		puchaseRepo.save(pi3);
		puchaseRepo.save(pi4);
		puchaseRepo.save(pi5);
		puchaseRepo.save(pi6);
		
	}

}
