package com.supermarket.main;

/**
 * @author Mohamed TALHA
 *
 */
public class ThreeForTwo implements Offer {

	@Override
	public double applyOffer(long qantity, double unitPrice) {
		return ((qantity / 3) * 2 + qantity % 3) * unitPrice;
	}
}
