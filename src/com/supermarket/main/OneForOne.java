package com.supermarket.main;

/**
 * @author Mohamed TALHA
 *
 */
public class OneForOne implements Offer {

	@Override
	public double applyOffer(long qantity, double unitPrice) {
		return qantity * unitPrice;
	}
}
