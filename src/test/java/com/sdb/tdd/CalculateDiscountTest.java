package com.sdb.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount = new CalculateDiscount();
	public static final String SOFTWARE_DEVELOPMENT_BOOK_I = "Clean Code (Robert Martin, 2008)";
	public static final String SOFTWARE_DEVELOPMENT_BOOK_II = "The Clean Coder (Robert Martin, 2011)";

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		String book = SOFTWARE_DEVELOPMENT_BOOK_I;
		assertEquals(50.0, calculateDiscount.getTotalPrice());
	}

}
