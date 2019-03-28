package com.supermarket.main;

/**
 * @author Mohamed TALHA
 *
 */
public interface Offer {
	/**
	 * apply the offer and calculate the amount of the item 
	 * @param qantity
	 * @param unitPrice
	 * @return the amount to pay
	 */
	public double applyOffer(long qantity, double unitPrice);
}