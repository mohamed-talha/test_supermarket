package com.supermarket.main;

import java.util.Map;
import java.util.HashMap;

/**
 * @author Mohamed TALHA
 *
 */
public class Basket {
	/**
	 * @param item
	 * @param quantity
	 * @return the price to pay after applying the offer
	 */
	public static double calculateItemPrice(Item item, Integer quantity) {
		return item.offer.applyOffer(quantity, item.unitPrice);
	}
	
	public static void main(String[] args) {
		// create  items
		Item apple = new Item("Apple", 0.2, new TwoForOne());
		Item orange = new Item("Orange", 0.5, new OneForOne());
		Item watermelon = new Item("Watermelon", 0.8, new ThreeForTwo());
		
		// create basket
		Map<Item, Integer> allItems = new HashMap<>();
		allItems.put(apple, 4);
		allItems.put(orange, 3);
		allItems.put(watermelon, 5);
		
		// for each item, calculate the price and print the result
		allItems.forEach((item, qty)->{
			System.out.println(item.name + " : " + calculateItemPrice(item, qty) + "£ (" + qty + " items)");
		});
	}
}
