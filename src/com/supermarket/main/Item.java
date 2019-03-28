package com.supermarket.main;

/**
 * @author Mohamed TALHA
 *
 */
public class Item {
	String name;
	Double unitPrice;
	Offer offer;
	
	/**
	 * @param name
	 * @param unitPrice
	 * @param offer
	 */
	public Item(String name, Double unitPrice, Offer offer) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.offer = offer;
	}
}
