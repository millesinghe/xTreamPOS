package com.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.stock.PurchaseItem;

public interface PurchaseItemRepository  extends JpaRepository<PurchaseItem, Long>{

}
