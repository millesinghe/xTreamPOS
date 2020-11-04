package com.pos.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.pos.stock.Item;
import com.pos.stock.PurchaseItem;

@Repository
@Transactional
public class POSRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public String insertItem(Item item) {
		entityManager.persist(item);
		return item.getItemNo();
	}
	
	public Long insertPurchaseItem(PurchaseItem item) {
		entityManager.persist(item);
		return item.getId();
	}
}
