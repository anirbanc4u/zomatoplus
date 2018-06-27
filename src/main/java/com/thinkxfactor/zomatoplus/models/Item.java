package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tbl_AddItem")
public class Item implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long itemId;
		
	@Column(name="restaurant_id")
	private Long restaurantId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;

	@Column(name="description")
	private String description;
	
	public Item()
	{
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long id) {
		this.itemId = id;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
