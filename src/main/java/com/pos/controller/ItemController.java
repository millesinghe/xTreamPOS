package com.pos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pos.repository.ItemRepository;
import com.pos.stock.Item;

@CrossOrigin(origins = {"http://localhost:4200","http://192.168.1.120:4200"})
@RestController
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepo;

	@GetMapping(path = "/")
	public String testServer() {
		return "Server Online...";
	}

	@GetMapping(path = "/item")
	public List<Item> filterItem() {
		return itemRepo.findAll();
	}
	
	@GetMapping(path = "/item-id/{id}")
	public List<Item> filterById(@PathVariable String id) {
		System.out.println("Requested ITEM ID > "+id);
		List<Item> searchRes = itemRepo.findByItemNoContaining(id);
		return searchRes;
	}
	
	@PostMapping(path = "/item")
	public void addItem(Item item) {

	}

	@PutMapping(path = "/item")
	public void updateItem() {

	}
	
	@DeleteMapping(path = "/item")
	public void removeItem() {

	}
	
}
