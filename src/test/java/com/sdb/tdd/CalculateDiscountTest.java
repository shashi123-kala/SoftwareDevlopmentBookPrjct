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
import com.sdb.entity.SoftwareDevlopmentBookEnum;

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
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		calculateDiscount.Add(sdbFirstI);
		assertEquals(50.0, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevelopmentBook sdbSecondI = new SoftwareDevelopmentBook(enumBookII.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		assertEquals(95.0, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingThreeCopiesOfDifferentBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevelopmentBook sdbSecondI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevlopmentBookEnum enumBookIII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIII;
		SoftwareDevelopmentBook sdbThirdI = new SoftwareDevelopmentBook(enumBookIII.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		assertEquals(135, calculateDiscount.getTotalPrice());

	}

	@Test
	public void buyingFourCopiesOfDifferentBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevelopmentBook sdbSecondI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevlopmentBookEnum enumBookIII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIII;
		SoftwareDevelopmentBook sdbThirdI = new SoftwareDevelopmentBook(enumBookIII.getName());
		SoftwareDevlopmentBookEnum enumBookIV = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIV;
		SoftwareDevelopmentBook sdbFourthIV = new SoftwareDevelopmentBook(enumBookIV.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbFourthIV);
		assertEquals(160, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingFiveCopiesOfDifferentBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevelopmentBook sdbSecondI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevlopmentBookEnum enumBookIII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIII;
		SoftwareDevelopmentBook sdbThirdI = new SoftwareDevelopmentBook(enumBookIII.getName());
		SoftwareDevlopmentBookEnum enumBookIV = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIV;
		SoftwareDevelopmentBook sdbFourthIV = new SoftwareDevelopmentBook(enumBookIV.getName());
		SoftwareDevlopmentBookEnum enumBookV = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKV;
		SoftwareDevelopmentBook sdbFifthI = new SoftwareDevelopmentBook(enumBookV.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbFourthIV);
		calculateDiscount.Add(sdbFifthI);
		assertEquals(187.50, calculateDiscount.getTotalPrice());
	}

}
