package com.pos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pos.stock.Item;

public interface ItemRepository  extends JpaRepository<Item, String>{
	
	List<Item> findByItemNoContaining(String id);
	

}
