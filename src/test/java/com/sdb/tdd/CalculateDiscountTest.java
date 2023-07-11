package com.sdb.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sdb.constants.SoftwareDevlopmentBooksConstants;
import com.sdb.entity.SoftwareDevelopmentBook;
import com.sdb.entity.SoftwareDevelopmentBookSetDiscount;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount;

	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(
				SoftwareDevlopmentBooksConstants.TWO_BOOKS, SoftwareDevlopmentBooksConstants.FIVE_PERCENT_DISCOUNT));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(
				SoftwareDevlopmentBooksConstants.THREE_BOOKS, SoftwareDevlopmentBooksConstants.TEN_PERCENT_DISCOUNT));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(
				SoftwareDevlopmentBooksConstants.FOUR_BOOKS, SoftwareDevlopmentBooksConstants.TWENTY_PERCENT_DISCOUNT));
		byDifferentCopiesDiscountList
				.add(new SoftwareDevelopmentBookSetDiscount(SoftwareDevlopmentBooksConstants.FIVE_BOOKS,
						SoftwareDevlopmentBooksConstants.TWENTY_FIVE_PERCENT_DISCOUNT));
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

	@Test
	public void buyingThreeCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		assertEquals(135, calculateDiscount.getTotalPrice());

	}

	@Test
	public void buyingFourCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbFourthIV = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIVBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbFourthIV);
		assertEquals(160, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingFiveCopiesOfDifferentBook() {
		SoftwareDevelopmentBook sdbFirstI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIBook();
		SoftwareDevelopmentBook sdbSecondI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIBook();
		SoftwareDevelopmentBook sdbThirdI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIIIBook();
		SoftwareDevelopmentBook sdbFourthIV = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentIVBook();
		SoftwareDevelopmentBook sdbFifthI = SoftwareDevlopmentBookList.GivenASoftwareDevelopmentVBook();
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbFourthIV);
		calculateDiscount.Add(sdbFifthI);
		assertEquals(187.50, calculateDiscount.getTotalPrice());
	}

}
