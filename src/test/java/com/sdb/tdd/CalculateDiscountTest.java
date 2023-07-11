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

	@Test
	public void buyingFourCpysOfTwoDifftBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstIII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstIV = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbSecI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbSecII = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbSecIII = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbSecIV = new SoftwareDevelopmentBook(enumBookII.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbFirstIII);
		calculateDiscount.Add(sdbFirstIV);
		calculateDiscount.Add(sdbSecI);
		calculateDiscount.Add(sdbSecII);
		calculateDiscount.Add(sdbSecIII);
		calculateDiscount.Add(sdbSecIV);
		assertEquals(380.0, calculateDiscount.getTotalPrice());

	}

	@Test
	public void buyingTwoCopiesOfThreeDiffBookAndOneCpyOfTwoDiffBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevlopmentBookEnum enumBookIII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIII;
		SoftwareDevlopmentBookEnum enumBookIV = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIV;
		SoftwareDevlopmentBookEnum enumBookV = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKV;
		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbSecondI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbSecondII = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbThirdI = new SoftwareDevelopmentBook(enumBookIII.getName());
		SoftwareDevelopmentBook sdbThirdII = new SoftwareDevelopmentBook(enumBookIII.getName());
		SoftwareDevelopmentBook sdbFourthI = new SoftwareDevelopmentBook(enumBookIV.getName());
		SoftwareDevelopmentBook sdbFifthI = new SoftwareDevelopmentBook(enumBookV.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbSecondII);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbThirdII);
		calculateDiscount.Add(sdbFourthI);
		calculateDiscount.Add(sdbFifthI);
		assertEquals(320, calculateDiscount.getTotalPrice());

	}

	@Test
	public void buyingFiveCpsOfSingleBookWithOneCopyOfSingleBookAndTwoCpyOfSinglBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevlopmentBookEnum enumBookIII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIII;

		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstIII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstIV = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstV = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbSecondI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbThirdI = new SoftwareDevelopmentBook(enumBookIII.getName());
		SoftwareDevelopmentBook sdbThirdII = new SoftwareDevelopmentBook(enumBookIII.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbFirstIII);
		calculateDiscount.Add(sdbFirstIV);
		calculateDiscount.Add(sdbFirstV);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbThirdII);
		assertEquals(380.00, calculateDiscount.getTotalPrice());
	}

	public void buyingFiveCpyOfOneBookWithOneCpyOfThreeDifftBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevlopmentBookEnum enumBookIII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIII;
		SoftwareDevlopmentBookEnum enumBookIV = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIV;

		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstIII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstIV = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstV = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbSecondI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbThirdI = new SoftwareDevelopmentBook(enumBookIII.getName());
		SoftwareDevelopmentBook sdbFourthI = new SoftwareDevelopmentBook(enumBookIV.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbFirstIII);
		calculateDiscount.Add(sdbFirstIV);
		calculateDiscount.Add(sdbFirstV);
		calculateDiscount.Add(sdbSecondI);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbFourthI);
		assertEquals(360.0, calculateDiscount.getTotalPrice());
	}

	@Test
	public void buyingThreeCpyOfTwoDifftBookWithTwoCopsOfoneBook() {
		SoftwareDevlopmentBookEnum enumBookI = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKI;
		SoftwareDevlopmentBookEnum enumBookII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKII;
		SoftwareDevlopmentBookEnum enumBookIII = SoftwareDevlopmentBookEnum.SOFTWARE_DEVELOPMENT_BOOKIII;

		SoftwareDevelopmentBook sdbFirstI = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbFirstIII = new SoftwareDevelopmentBook(enumBookI.getName());
		SoftwareDevelopmentBook sdbSecI = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbSecII = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbSecIII = new SoftwareDevelopmentBook(enumBookII.getName());
		SoftwareDevelopmentBook sdbThirdI = new SoftwareDevelopmentBook(enumBookIII.getName());
		SoftwareDevelopmentBook sdbThirdII = new SoftwareDevelopmentBook(enumBookIII.getName());
		calculateDiscount.Add(sdbFirstI);
		calculateDiscount.Add(sdbFirstII);
		calculateDiscount.Add(sdbFirstIII);
		calculateDiscount.Add(sdbSecI);
		calculateDiscount.Add(sdbSecII);
		calculateDiscount.Add(sdbSecIII);
		calculateDiscount.Add(sdbThirdI);
		calculateDiscount.Add(sdbThirdII);
		assertEquals(365.00, calculateDiscount.getTotalPrice());
	}

}
