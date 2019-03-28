package com.supermarket.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.supermarket.main.Offer;
import com.supermarket.main.TwoForOne;

class TwoForOneTest {

	@Test
	void applyOfferTest() {
		Offer twoForOne = new TwoForOne();
		assertEquals(0.4, twoForOne.applyOffer(4, 0.2));
	}
}
