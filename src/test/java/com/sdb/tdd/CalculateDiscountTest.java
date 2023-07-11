package com.sdb.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount = new CalculateDiscount();

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		String book = "Clean Code (Robert Martin, 2008)";
		assertEquals(50.0, calculateDiscount.getTotalPrice());
	}

}
