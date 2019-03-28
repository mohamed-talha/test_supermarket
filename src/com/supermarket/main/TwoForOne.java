package com.supermarket.main;

/**
 * @author Mohamed TALHA
 *
 */
public class TwoForOne implements Offer {

	@Override
	public double applyOffer(long qantity, double unitPrice) {
		return (qantity / 2 + qantity % 2) * unitPrice;
	}
}
