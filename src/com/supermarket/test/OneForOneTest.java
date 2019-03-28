package com.supermarket.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.supermarket.main.Offer;
import com.supermarket.main.OneForOne;

class OneForOneTest {

	@Test
	void applyOfferTest() {
		Offer oneForOne = new OneForOne();
		assertEquals(1.5, oneForOne.applyOffer(3, 0.5));
	}

}
