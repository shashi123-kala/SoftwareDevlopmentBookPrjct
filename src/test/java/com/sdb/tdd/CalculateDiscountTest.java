package com.sdb.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sdb.entity.SoftwareDevelopmentBook;
import com.sdb.entity.SoftwareDevelopmentBookSetDiscount;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount;
	public static final int FIVE_PERCENT_DISCOUNT = 5;
	public static final int TEN_PERCENT_DISCOUNT = 10;
	public static final int TWENTY_PERCENT_DISCOUNT = 20;
	public static final int TWENTY_FIVE_PERCENT_DISCOUNT = 25;

	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(2, FIVE_PERCENT_DISCOUNT));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(3, TEN_PERCENT_DISCOUNT));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(4, TWENTY_PERCENT_DISCOUNT));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(5, TWENTY_FIVE_PERCENT_DISCOUNT));
		calculateDiscount = new CalculateDiscount(byDifferentCopiesDiscountList);
	}

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		calculateDiscount.Add(sdbFirstI);
		assertEquals(50.0, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		assertEquals(95.0, calculateDiscount.getTotalPrice());
	}

}
