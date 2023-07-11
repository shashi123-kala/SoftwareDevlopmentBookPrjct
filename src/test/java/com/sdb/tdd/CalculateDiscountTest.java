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

	CalculateDiscount calculateDiscount = new CalculateDiscount();

	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(2, 5));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(3, 10));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(4, 20));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(5, 25));
	}

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		assertEquals(50.0, calculateDiscount.getTotalPrice());
	}

}
