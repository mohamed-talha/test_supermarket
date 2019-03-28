package com.supermarket.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.supermarket.main.Offer;
import com.supermarket.main.ThreeForTwo;

class ThreeForTwoTest {

	@Test
	void applyOfferTest() {
		Offer threeForTwo = new ThreeForTwo();
		assertEquals(3.2, threeForTwo.applyOffer(5, 0.8));
	}

}
