package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.models.Item;



@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/getallRestaurent")
	public List<Restaurant> restList(){
		List<Restaurant> usr=restaurantRepository.findAll();
		return usr;
	}

	
	@PostMapping("/addRestaurent")
	public Restaurant restcreate(@RequestBody Restaurant rest) {
		Restaurant persistedRestaurant=restaurantRepository.save(rest);
		return persistedRestaurant;
	}

	
	@PostMapping("/addItem")
	public Item aditemcreate(@RequestBody Item it) {
		Item persistedItem=itemRepository.save(it);
		return persistedItem;		
	}
	
	@PostMapping("/getAllItem")
	public List<Item> itemList(@RequestParam("id") Long id){
		
		List<Item> itm=(List<Item>) itemRepository.findByRestaurantId(id);
		return itm;
	}
}
